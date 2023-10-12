package com.oak.bookyourshelf.repository;

import com.oak.bookyourshelf.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface CheckoutRepository extends CrudRepository<Order,Integer> {

}
