package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

import java.math.BigInteger;

public class PaymentOrderAdminRequestVO extends BankAdminRequestVO {

    private BigInteger paymentOrderId;

    public BigInteger getPaymentOrderId() {
        return paymentOrderId;
    }

    public void setPaymentOrderId(BigInteger paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
    }
}
