package com.heony.payment.repository;

import org.springframework.data.repository.CrudRepository;
import com.heony.payment.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
