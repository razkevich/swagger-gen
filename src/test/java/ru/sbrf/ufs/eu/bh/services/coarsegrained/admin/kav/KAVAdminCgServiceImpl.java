package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.kav;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.kav.GetKAVSettingsRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.kav.GetKAVSettingsResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.kav.SetKAVSettingsRequestVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/KAVAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class KAVAdminCgServiceImpl implements KAVAdminCgService {

    @POST
    @Path("/setKAVSettings")
    @Override
    public CommonResponseVO setKAVSettings(SetKAVSettingsRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getKAVSettings")
    @Override
    public GetKAVSettingsResponseVO getKAVSettings(GetKAVSettingsRequestVO request) {
        return new GetKAVSettingsResponseVO();
    }
}
