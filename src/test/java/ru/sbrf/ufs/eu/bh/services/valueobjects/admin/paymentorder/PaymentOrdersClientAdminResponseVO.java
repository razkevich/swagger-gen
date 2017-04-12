package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class PaymentOrdersClientAdminResponseVO extends CommonResponseVO {

    private List<PaymentOrderInfoVO> paymentOrders;

    public List<PaymentOrderInfoVO> getPaymentOrders() {
        return paymentOrders;
    }

    public void setPaymentOrders(List<PaymentOrderInfoVO> paymentOrders) {
        this.paymentOrders = paymentOrders;
    }
}
