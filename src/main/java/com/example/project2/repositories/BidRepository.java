package com.example.project2.repositories;

import com.example.project2.models.Bid;
import org.springframework.data.repository.CrudRepository;

public interface BidRepository extends CrudRepository <Bid,Long> {
}
