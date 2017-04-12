package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class GetConfigParameterAdminRequestVO extends BankAdminRequestVO {

    private String categoryGroup;
    private String category;
    private String parameterName;

    public String getCategoryGroup() {
        return this.categoryGroup;
    }

    public void setCategoryGroup(String categoryGroup) {
        this.categoryGroup = categoryGroup;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getParameterName() {
        return this.parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
}
