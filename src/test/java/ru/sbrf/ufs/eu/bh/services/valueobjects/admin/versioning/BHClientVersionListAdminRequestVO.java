package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class BHClientVersionListAdminRequestVO extends BankAdminRequestVO {

    private Boolean supportedStatus;

    public Boolean getSupportedStatus() {
        return this.supportedStatus;
    }

    public void setSupportedStatus(Boolean supportedStatus) {
        this.supportedStatus = supportedStatus;
    }
}
