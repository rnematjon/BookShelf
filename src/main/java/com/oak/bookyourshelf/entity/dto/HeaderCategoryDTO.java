package com.oak.bookyourshelf.entity.dto;

import com.oak.bookyourshelf.entity.Category;

public class HeaderCategoryDTO {
    int id;
    String name;

    public HeaderCategoryDTO(Category category) {
        this.id = category.getId();
        this.name = category.getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
