package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client.ClientAdminRequestVO;

public class PaymentOrdersClientAdminRequestVO extends ClientAdminRequestVO {

    private PaymentOrderClientAdminFilterVO filter;


    public PaymentOrderClientAdminFilterVO getFilter() {
        return filter;
    }

    public void setFilter(PaymentOrderClientAdminFilterVO filter) {
        this.filter = filter;
    }
}
