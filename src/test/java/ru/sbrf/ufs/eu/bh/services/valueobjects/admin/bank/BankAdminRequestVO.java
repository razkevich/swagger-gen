package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;

public class BankAdminRequestVO {

    private BankIdEnum bankId;

    public BankIdEnum getBankId() {
        return bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }
}
