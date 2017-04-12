package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class EnableServiceAdminRequestVO extends BankAdminRequestVO {

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
