package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.config;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config.*;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.limit.SaveHardChannelLimitRequestVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/SfsConfigAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class SfsConfigAdminCgServiceImpl implements SfsConfigAdminCgService {

    @POST
    @Path("/updateParameter")
    @Override
    public CommonResponseVO updateParameter(UpdateConfigParameterAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getParametersList")
    @Override
    public ConfigListResponseVO getParametersList(ConfigListRequestVO request) {
        return new ConfigListResponseVO();
    }

    @Deprecated
    @POST
    @Path("/getParameter")
    @Override
    public GetConfigParameterAdminResponseVO getParameter(GetConfigParameterAdminRequestVO request) {
        return new GetConfigParameterAdminResponseVO();
    }

    @POST
    @Path("/updateHardLimit")
    @Override
    public CommonResponseVO updateHardLimit(SaveHardChannelLimitRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getEnumValueList")
    @Override
    public GetEnumValueListResponseVO getEnumValueList(GetEnumValueListRequestVO request) {
        return new GetEnumValueListResponseVO();
    }
}
