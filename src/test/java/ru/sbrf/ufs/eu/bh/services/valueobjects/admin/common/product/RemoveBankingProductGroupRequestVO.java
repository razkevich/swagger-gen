package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.product;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class RemoveBankingProductGroupRequestVO extends BankAdminRequestVO {

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
