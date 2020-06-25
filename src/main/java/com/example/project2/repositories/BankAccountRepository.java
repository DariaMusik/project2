package com.example.project2.repositories;

import com.example.project2.models.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount,Long> {
}
