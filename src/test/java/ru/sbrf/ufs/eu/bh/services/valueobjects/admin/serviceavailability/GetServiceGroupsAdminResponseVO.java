package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class GetServiceGroupsAdminResponseVO extends CommonResponseVO {

    private List<ServiceGroupVO> serviceGroups;

    public List<ServiceGroupVO> getServiceGroups() {
        return this.serviceGroups;
    }

    public void setServiceGroups(List<ServiceGroupVO> serviceGroups) {
        this.serviceGroups = serviceGroups;
    }
}
