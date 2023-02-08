package com.mercado.model.product;

import com.mercado.model.BaseEntity;
import java.util.List;

public class Recipe extends BaseEntity {
    private String name;
    private List<StepRecipe> steps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StepRecipe> getSteps() {
        return steps;
    }

    public void setSteps(List<StepRecipe> steps) {
        this.steps = steps;
    }
}
