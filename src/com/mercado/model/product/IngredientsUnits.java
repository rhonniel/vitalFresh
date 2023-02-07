package com.mercado.model.product;

import com.mercado.model.BaseEntity;

public class IngredientsUnits extends BaseEntity {

    private Ingredient ingredient;
    private Measure measure;
    private Integer calories;

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

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
}
