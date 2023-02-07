package com.mercado.model.product;

import com.mercado.model.BaseEntity;

public class Ingredient extends BaseEntity {
    private String name;
    private Measure measure;
    private Integer calories;

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
