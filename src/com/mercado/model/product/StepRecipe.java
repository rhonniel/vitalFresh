package com.mercado.model.product;

import com.mercado.model.BaseEntity;

public class StepRecipe extends BaseEntity {
    private Ingredient ingredient;
    private Integer quantity;
    private String details;

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
