package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.versioning;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning.BHClientVersionListAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning.BHClientVersionListAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning.BHClientVersionVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/VersioningAdminCgService")
public class VersioningAdminCgServiceImpl implements VersioningAdminCgService {

    @Override
    @POST
    @Path("/getBusinessHubVersion")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public String getBusinessHubVersion() {
        return "sdf";
    }

    @Override
    @POST
    @Path("/updateSupportedVersion")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public CommonResponseVO updateSupportedVersion(BHClientVersionVO version) {
        return new CommonResponseVO();
    }

    @Override
    @POST
    @Path("/getSupportedVersionsList")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public BHClientVersionListAdminResponseVO getSupportedVersionsList(BHClientVersionListAdminRequestVO request) {
        return new BHClientVersionListAdminResponseVO();
    }

    @Override
    @POST
    @Path("/createSupportedVersion")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public CommonResponseVO createSupportedVersion(BHClientVersionVO version) {
        return new CommonResponseVO();
    }
}
