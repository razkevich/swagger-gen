package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class ConfigListRequestVO extends BankAdminRequestVO {

    private ConfigListFilterVO filter;

    public ConfigListFilterVO getFilter() {
        return filter;
    }

    public void setFilter(ConfigListFilterVO filter) {
        this.filter = filter;
    }
}
