package com.capeelectric.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.capeelectric.model.Register;
import com.capeelectric.repository.RegisterRepository;

public class DBRegister implements ItemWriter<Register> {

	private RegisterRepository registerRepository;

	@Autowired
	public DBRegister(RegisterRepository registerRepository) {
		this.registerRepository = registerRepository;
	}

	@Override
	public void write(List<? extends Register> register) throws Exception {
		System.out.println("Data Saved for Users: " + register);
		registerRepository.saveAll(register);
	}
}