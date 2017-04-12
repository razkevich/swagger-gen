package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class PaymentOrdersAdminRequestVO extends BankAdminRequestVO {

    private PaymentOrderAdminFilterVO filter;

    public PaymentOrderAdminFilterVO getFilter() {
        return this.filter;
    }

    public void setFilter(PaymentOrderAdminFilterVO filter) {
        this.filter = filter;
    }
}
