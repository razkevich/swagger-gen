package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ClientSecurityAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class ClientSecurityAdminCgServiceImpl implements ClientSecurityAdminCgService {

    @POST
    @Path("/closeClientSession")
    public void closeClientSession() {
    }

    @POST
    @Path("/getSessionList")
    public void getSessionList() {
    }

    @POST
    @Path("/getClientSessions")
    public void getClientSessions() {
    }
}
