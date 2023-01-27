package com.mercado.model.product;

import com.mercado.model.BaseEntity;

public class Measure extends BaseEntity {
    private String name;
    private String abbreviation;
    private MeasureType measureType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public MeasureType getMeasureType() {
        return measureType;
    }

    public void setMeasureType(MeasureType measureType) {
        this.measureType = measureType;
    }


}
