package ru.sbrf.swagger.gen.example.model;


import io.swagger.annotations.ApiModel;

@ApiModel(parent = CommonRequestVO.class, subTypes = {TestConcreteRequestVO.class, TestConcreteRequest2VO.class})
public abstract class TestAbstractRequestVO extends CommonRequestVO {
    private String abstractString;

    public String getAbstractString() {
        return abstractString;
    }

    public void setAbstractString(String abstractString) {
        this.abstractString = abstractString;
    }
}
