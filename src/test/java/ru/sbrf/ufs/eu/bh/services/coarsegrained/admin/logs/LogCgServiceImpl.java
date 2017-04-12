package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.logs;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.logs.GetLogRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.logs.GetLogResponseVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/LogCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class LogCgServiceImpl implements LogCgService {

    @POST
    @Path("/getLogData")
    @Override
    public GetLogResponseVO getLogData(GetLogRequestVO request) {
        return new GetLogResponseVO();
    }
}
