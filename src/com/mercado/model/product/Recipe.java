package com.mercado.model.product;

import java.util.List;

public class Recipe {
    private int id;
    private String name;
    private List<StepRecipe> stepsRecipe;
    private boolean isActive;

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

    public List<StepRecipe> getStepsRecipe() {
        return stepsRecipe;
    }

    public void setStepsRecipe(List<StepRecipe> stepsRecipe) {
        this.stepsRecipe = stepsRecipe;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
