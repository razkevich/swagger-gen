package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class UpdateServicePropertiesAdminRequestVO extends BankAdminRequestVO {

    private Integer errorLimit;
    private Integer downtimeDuration;
    private Long id;

    public Integer getErrorLimit() {
        return this.errorLimit;
    }

    public void setErrorLimit(Integer errorLimit) {
        this.errorLimit = errorLimit;
    }

    public Integer getDowntimeDuration() {
        return this.downtimeDuration;
    }

    public void setDowntimeDuration(Integer downtimeDuration) {
        this.downtimeDuration = downtimeDuration;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
