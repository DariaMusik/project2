package com.example.project2.repositories;

import com.example.project2.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository <Address,Long> {
}
