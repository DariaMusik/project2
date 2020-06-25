package com.example.project2.repositories;

import com.example.project2.models.CreditCard;
import org.springframework.data.repository.CrudRepository;

public interface CreditCardRepository extends CrudRepository <CreditCard,Long> {
}
