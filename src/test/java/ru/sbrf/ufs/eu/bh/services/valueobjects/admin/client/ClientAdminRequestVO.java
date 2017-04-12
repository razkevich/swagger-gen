package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class ClientAdminRequestVO extends BankAdminRequestVO {

    private Long clientId;

    public Long getClientId() {
        return this.clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
