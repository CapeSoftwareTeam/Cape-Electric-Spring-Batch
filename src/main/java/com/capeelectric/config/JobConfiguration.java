package com.capeelectric.config;

import java.time.LocalDateTime;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capeelectric.model.Register;
import com.capeelectric.model.User;
import com.capeelectric.repository.RegisterRepository;

@Configuration
public class JobConfiguration {
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private DataSource dataSource;

	@Autowired
	private RegisterRepository registerRepository;
	
	private Register register;

	@Bean
	public JdbcCursorItemReader<User> cursorItemReader() {
		JdbcCursorItemReader<User> reader = new JdbcCursorItemReader<>();
		reader.setSql("SELECT * FROM users");
		reader.setDataSource(dataSource);
		reader.setRowMapper(new UserRowMapper());
		return reader;
	}

	@Bean
	public ItemWriter<? super User> customerItemWriter() {
		return items -> {
			for (User user : items) {
				if (user != null && user.getEmail() != null) {
					register = new Register();
					register.setRegisterId(user.getId());
					register.setName(user.getFirstname() + user.getLastname());
					register.setState("Tamil Nadu");
					register.setDistrict("Chennai");
					register.setPassword(user.getPassword());
					register.setCountry("India");
					register.setPermission("YES");
					register.setPermissionBy("sd@capeindia.net");
					register.setCreatedDate(user.getCreationdate());
					register.setCreatedBy("sd@capeindia.net");
					register.setUpdatedDate(LocalDateTime.now());
					register.setUpdatedBy(user.getUsername());
					//register.setSiteName("Site");
					
					if (user.getEmail().contains("@capeindia.net")) {
						register.setUsername(user.getEmail());
						register.setAddress(" A-41B, SIPCOT Industrial Growth Centre Sriperumbudur Taluk, Oragaram");
						register.setPinCode("602105");
						register.setNoOfLicence("0");
						register.setRole("INSPECTOR");

					} else {
						register.setUsername(user.getEmail());
						register.setAddress("K.K. Nagar ,Chennai");
						register.setPinCode("600 008");
						register.setRole("VIEWER");
						register.setAssignedBy("sd@capeindia.net");
					}
					registerRepository.save(register);
				}
			}
		};
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<User, User>chunk(5).reader(cursorItemReader())
				.writer(customerItemWriter()).build();
	}

	@Bean
	public Job job() {
		return jobBuilderFactory.get("job").start(step1()).build();
	}

}