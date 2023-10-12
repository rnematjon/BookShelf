package com.oak.bookyourshelf.repository;

import com.oak.bookyourshelf.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface WishListRepository extends CrudRepository<Product,Integer> {


}
