package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.product;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ProductAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class ProductAdminCgServiceImpl implements ProductAdminCgService {

    @POST
    @Path("/getProductsParameters")
    @Override
    public void getProductsParameters() {
    }

    @POST
    @Path("/updateProductOrder")
    @Override
    public void updateProductOrder() {
    }

    @POST
    @Path("/updateDefaultProductOrder")
    @Override
    public void updateDefaultProductOrder() {
    }
}
