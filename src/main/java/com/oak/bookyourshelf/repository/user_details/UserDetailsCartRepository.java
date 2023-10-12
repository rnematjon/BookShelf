package com.oak.bookyourshelf.repository.user_details;

import com.oak.bookyourshelf.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailsCartRepository extends CrudRepository<Product, Integer> {
}
