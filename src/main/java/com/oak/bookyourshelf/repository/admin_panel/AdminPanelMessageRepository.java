package com.oak.bookyourshelf.repository.admin_panel;

import org.springframework.data.repository.CrudRepository;
import com.oak.bookyourshelf.entity.Message;

public interface AdminPanelMessageRepository extends CrudRepository<Message, Integer> {
}
