package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class PaymentOrdersAdminResponseVO extends CommonResponseVO {

    private List<PaymentOrderDetailedInfoVO> paymentOrders;
    private Long totalCount;

    public List<PaymentOrderDetailedInfoVO> getPaymentOrders() {
        return paymentOrders;
    }

    public void setPaymentOrders(List<PaymentOrderDetailedInfoVO> paymentOrders) {
        this.paymentOrders = paymentOrders;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
