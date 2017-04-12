package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.audit;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit.ExportAuditRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit.GetAuditRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit.GetAuditResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit.GetClientAuditRequestVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/AuditCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class AuditCgServiceImpl implements AuditCgService {

    @POST
    @Path("/getAuditData")
    @Override
    public GetAuditResponseVO getAuditData(GetAuditRequestVO request) {
        return new GetAuditResponseVO();
    }

    @POST
    @Path("/exportAuditData")
    @Override
    public CommonResponseVO exportAuditData(ExportAuditRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getClientAuditData")
    @Override
    public GetAuditResponseVO getClientAuditData(GetClientAuditRequestVO request) {
        return new GetAuditResponseVO();
    }
}
