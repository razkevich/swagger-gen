package ru.sbrf.swagger.gen.example.model;

import io.swagger.annotations.ApiModel;

import java.util.Calendar;
import java.util.List;

@ApiModel(parent = CommonResponseVO.class, subTypes = {TestConcreteResponse2VO.class, TestConcreteResponseVO.class})
public abstract class TestAbstractResponseVO extends CommonResponseVO {
    private List<String> abstractList;

    public TestAbstractResponseVO(CommonResult success, Calendar instance, String s, List<String> abstractList) {
        super(success, instance, s);
        this.abstractList = abstractList;
    }

    public TestAbstractResponseVO() {
    }

    public List<String> getAbstractList() {
        return abstractList;
    }

    public void setAbstractList(List<String> abstractList) {
        this.abstractList = abstractList;
    }
}
