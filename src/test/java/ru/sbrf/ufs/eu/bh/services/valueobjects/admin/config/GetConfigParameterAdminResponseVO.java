package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

@ApiModel(parent = CommonResponseVO.class)
public class GetConfigParameterAdminResponseVO extends CommonResponseVO {

    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
