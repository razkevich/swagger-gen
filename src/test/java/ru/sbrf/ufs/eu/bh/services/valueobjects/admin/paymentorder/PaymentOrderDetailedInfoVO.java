package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client.ClientShortInfoVO;

public class PaymentOrderDetailedInfoVO extends PaymentOrderInfoVO {

    private ClientShortInfoVO client;

    public ClientShortInfoVO getClient() {
        return client;
    }

    public void setClient(ClientShortInfoVO client) {
        this.client = client;
    }
}
