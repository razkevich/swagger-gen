package ru.sbrf.swagger.gen.example.model;

import io.swagger.annotations.ApiModel;

@ApiModel(parent = TestAbstractRequestVO.class)
public class TestConcreteRequest2VO extends TestAbstractRequestVO {
    private String concreteString2;

    public String getConcreteString2() {
        return concreteString2;
    }

    public void setConcreteString2(String concreteString2) {
        this.concreteString2 = concreteString2;
    }
}
