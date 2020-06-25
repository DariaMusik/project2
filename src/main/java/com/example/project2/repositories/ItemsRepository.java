package com.example.project2.repositories;

import com.example.project2.models.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepository extends CrudRepository<Items,Long> {
}
