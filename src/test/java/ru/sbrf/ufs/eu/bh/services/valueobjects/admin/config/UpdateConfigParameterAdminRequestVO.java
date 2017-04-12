package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config;

public class UpdateConfigParameterAdminRequestVO extends GetConfigParameterAdminRequestVO {

    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
