package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.paymentorder;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder.*;

public interface PaymentOrderAdminCgService {

    PaymentOrdersAdminResponseVO getPaymentOrders(PaymentOrdersAdminRequestVO request);

    CommonResponseVO updatePaymentOrderStatus(UpdatePaymentOrderStatusAdminRequestVO request);

    PaymentOrdersClientAdminResponseVO getClientPaymentOrders(PaymentOrdersClientAdminRequestVO request);

    CommonResponseVO startPaymentOrderProcessing(PaymentOrderAdminRequestVO request);

    CommonResponseVO cancelPaymentOrderProcessing(PaymentOrderAdminRequestVO request);
}
