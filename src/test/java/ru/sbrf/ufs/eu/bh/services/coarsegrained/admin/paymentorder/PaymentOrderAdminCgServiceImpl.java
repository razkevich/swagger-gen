package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.paymentorder;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/PaymentOrderAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class PaymentOrderAdminCgServiceImpl implements PaymentOrderAdminCgService {

    @POST
    @Path("/getPaymentOrders")
    @Override
    public PaymentOrdersAdminResponseVO getPaymentOrders(PaymentOrdersAdminRequestVO request) {
        return new PaymentOrdersAdminResponseVO();
    }

    @POST
    @Path("/updatePaymentOrderStatus")
    @Override
    public CommonResponseVO updatePaymentOrderStatus(UpdatePaymentOrderStatusAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getClientPaymentOrders")
    @Override
    public PaymentOrdersClientAdminResponseVO getClientPaymentOrders(PaymentOrdersClientAdminRequestVO request) {
        return new PaymentOrdersClientAdminResponseVO();
    }

    @POST
    @Path("/startPaymentOrderProcessing")
    @Override
    public CommonResponseVO startPaymentOrderProcessing(PaymentOrderAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/cancelPaymentOrderProcessing")
    @Override
    public CommonResponseVO cancelPaymentOrderProcessing(PaymentOrderAdminRequestVO request) {
        return new CommonResponseVO();
    }
}
