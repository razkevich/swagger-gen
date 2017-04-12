package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class ConfigListResponseVO extends CommonResponseVO {

    private List<ConfigParameterVO> parameters;
    private Long totalCount;

    public List<ConfigParameterVO> getParameters() {
        return this.parameters;
    }

    public void setParameters(List<ConfigParameterVO> parameters) {
        this.parameters = parameters;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
