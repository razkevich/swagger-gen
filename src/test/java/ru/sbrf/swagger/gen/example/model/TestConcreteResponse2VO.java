package ru.sbrf.swagger.gen.example.model;

import io.swagger.annotations.ApiModel;

import java.util.Calendar;
import java.util.List;

@ApiModel(parent = TestAbstractResponseVO.class)
public class TestConcreteResponse2VO extends TestAbstractResponseVO {
    private String concrete2String;

    public TestConcreteResponse2VO() {
    }

    public TestConcreteResponse2VO(CommonResult success, Calendar instance, String s, List<String> stringList, String concreteString) {
        super(success, instance, s, stringList);
        this.concrete2String = concreteString;

    }

    public String getConcrete2String() {
        return concrete2String;
    }

    public void setConcrete2String(String concrete2String) {
        this.concrete2String = concrete2String;
    }
}
