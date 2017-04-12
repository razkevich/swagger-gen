package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.currency;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/CurrencyAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class CurrencyAdminCgServiceImpl implements CurrencyAdminCgService {

    @POST
    @Path("/getCurrenciesList")
    @Override
    public void getCurrenciesList() {
    }

    @POST
    @Path("/updateCurrencyOrder")
    @Override
    public void updateCurrencyOrder() {
    }
}
