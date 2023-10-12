package com.oak.bookyourshelf.repository;

import com.oak.bookyourshelf.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Order, Integer> {

    Order findByOrderCode(String orderCode);
}
