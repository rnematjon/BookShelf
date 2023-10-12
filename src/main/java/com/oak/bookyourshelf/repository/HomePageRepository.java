package com.oak.bookyourshelf.repository;

import com.oak.bookyourshelf.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface HomePageRepository extends CrudRepository<Product, Integer> {
}
