package com.mercado.model.user;

import com.mercado.model.BaseEntity;

public abstract class User extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
