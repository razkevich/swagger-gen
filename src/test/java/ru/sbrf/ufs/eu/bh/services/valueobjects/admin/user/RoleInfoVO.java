package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user;

import java.util.List;

public class RoleInfoVO {

    private String roleCode;
    private List<RightInfoVO> rights;
    private String roleDescription;

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public List<RightInfoVO> getRights() {
        return rights;
    }

    public void setRights(List<RightInfoVO> rights) {
        this.rights = rights;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}
