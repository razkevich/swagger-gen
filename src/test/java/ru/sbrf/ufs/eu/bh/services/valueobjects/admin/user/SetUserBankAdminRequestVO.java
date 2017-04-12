package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user;


import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;

public class SetUserBankAdminRequestVO extends UserAdminRequestVO {

    private BankIdEnum bankId;
    private BankIdEnum newBankId;

    public BankIdEnum getBankId() {
        return this.bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

    public BankIdEnum getNewBankId() {
        return newBankId;
    }

    public void setNewBankId(BankIdEnum newBankId) {
        this.newBankId = newBankId;
    }
}
