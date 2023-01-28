package com.mercado.model.product;

import com.mercado.model.BaseEntity;

public class Status extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
