package com.heony.stock.repository;

import org.springframework.data.repository.CrudRepository;
import com.heony.stock.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
