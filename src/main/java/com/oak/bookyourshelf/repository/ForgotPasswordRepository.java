package com.oak.bookyourshelf.repository;

import com.oak.bookyourshelf.entity.Log;
import com.oak.bookyourshelf.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ForgotPasswordRepository extends CrudRepository<Log, String> {
    @Query("SELECT t FROM User t WHERE t.email = ?1")
    User findByEmail(String email);
}
