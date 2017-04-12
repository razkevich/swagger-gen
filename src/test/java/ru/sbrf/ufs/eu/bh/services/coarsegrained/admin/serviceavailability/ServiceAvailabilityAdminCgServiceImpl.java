package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.serviceavailability;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability.DisableServiceAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability.EnableServiceAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability.GetServiceGroupsAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability.UpdateServicePropertiesAdminRequestVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ServiceAvailabilityAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class ServiceAvailabilityAdminCgServiceImpl implements ServiceAvailabilityAdminCgService {

    @POST
    @Path("/getServiceGroups")
    @Override
    public GetServiceGroupsAdminResponseVO getServiceGroups(BankAdminRequestVO request) {
        return new GetServiceGroupsAdminResponseVO();
    }

    @POST
    @Path("/enableService")
    @Override
    public CommonResponseVO enableService(EnableServiceAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/updateServiceProperties")
    @Override
    public CommonResponseVO updateServiceProperties(UpdateServicePropertiesAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/disableService")
    @Override
    public CommonResponseVO disableService(DisableServiceAdminRequestVO request) {
        return new CommonResponseVO();
    }
}
