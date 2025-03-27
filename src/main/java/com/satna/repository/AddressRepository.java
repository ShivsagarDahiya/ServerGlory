package com.satna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satna.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
