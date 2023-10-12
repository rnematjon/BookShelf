package com.oak.bookyourshelf.repository.user_details;

import org.springframework.data.repository.CrudRepository;
import com.oak.bookyourshelf.entity.Message;


public interface UserDetailsMessageRepository extends CrudRepository<Message, Integer> {
}
