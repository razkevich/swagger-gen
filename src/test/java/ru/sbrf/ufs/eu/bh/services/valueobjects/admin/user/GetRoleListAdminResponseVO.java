package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class GetRoleListAdminResponseVO extends CommonResponseVO {

    private List<RoleInfoVO> roles;

    public List<RoleInfoVO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleInfoVO> roles) {
        this.roles = roles;
    }
}
