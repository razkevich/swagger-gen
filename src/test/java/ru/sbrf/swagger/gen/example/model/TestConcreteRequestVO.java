package ru.sbrf.swagger.gen.example.model;

import io.swagger.annotations.ApiModel;

@ApiModel(parent = TestAbstractRequestVO.class)
public class TestConcreteRequestVO extends TestAbstractRequestVO {
    private String concreteString;

    public String getConcreteString() {
        return concreteString;
    }

    public void setConcreteString(String concreteString) {
        this.concreteString = concreteString;
    }
}
