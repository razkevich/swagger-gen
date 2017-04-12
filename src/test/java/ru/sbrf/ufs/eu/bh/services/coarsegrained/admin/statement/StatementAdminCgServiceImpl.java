package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.statement;


import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements.GetStatementSettingsRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements.GetStatementSettingsResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements.SetStatementSettingsRequestVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/StatementAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class StatementAdminCgServiceImpl implements StatementAdminCgService {

    @POST
    @Path("/setStatementSettings")
    @Override
    public CommonResponseVO setStatementSettings(SetStatementSettingsRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getStatementSettings")
    @Override
    public GetStatementSettingsResponseVO getStatementSettings(GetStatementSettingsRequestVO request) {
        return new GetStatementSettingsResponseVO();
    }
}
