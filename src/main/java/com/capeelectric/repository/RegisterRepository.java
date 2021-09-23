package com.capeelectric.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capeelectric.model.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer> {

}
