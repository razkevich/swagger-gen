package ru.sbrf.swagger.gen.example.model;

import io.swagger.annotations.ApiModel;

import java.util.Calendar;
import java.util.List;

@ApiModel(parent = TestAbstractResponseVO.class)
public class TestConcreteResponseVO extends TestAbstractResponseVO {
    private String concreteString;

    public TestConcreteResponseVO() {
    }

    public TestConcreteResponseVO(CommonResult success, Calendar instance, String s, List<String> stringList, String concreteString) {
        super(success, instance, s, stringList);
        this.concreteString = concreteString;

    }

    public String getConcreteString() {
        return concreteString;
    }

    public void setConcreteString(String concreteString) {
        this.concreteString = concreteString;
    }
}
