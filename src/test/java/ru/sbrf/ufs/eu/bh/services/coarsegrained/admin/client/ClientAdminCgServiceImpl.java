package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.client;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ClientAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class ClientAdminCgServiceImpl implements ClientAdminCgService {

    @POST
    @Path("/getClientList")
    @Override
    public ClientShortInfoResponseVO getClientList(ClientInfoSearchVO request) {
        return new ClientShortInfoResponseVO();
    }

    @POST
    @Path("/unregisterClientDevice")
    @Override
    public CommonResponseVO unregisterClientDevice(ClientDeviceAdminRequestVO request) {
        return new CommonResponseVO();

    }

    @POST
    @Path("/terminateClientActiveSessions")
    @Override
    public CommonResponseVO terminateClientActiveSessions(ClientChannelAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getClientDetails")
    @Override
    public ClientDetailedInfoVO getClientDetails(ClientAdminRequestVO request) {
        return new ClientDetailedInfoVO();
    }

    @POST
    @Path("/updateClientChannelStatus")
    @Override
    public CommonResponseVO updateClientChannelStatus(UpdateChannelStatusAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/resetClientChannelDailySmsLimit")
    @Override
    public CommonResponseVO resetClientChannelDailySmsLimit(ClientChannelAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/updateClientStatus")
    @Override
    public CommonResponseVO updateClientStatus(UpdateClientStatusAdminRequestVO request) {
        return new CommonResponseVO();
    }
}
