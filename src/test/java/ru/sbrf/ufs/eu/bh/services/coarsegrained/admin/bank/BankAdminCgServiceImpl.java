package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.bank;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankCurrenciesResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankParametersAdminResponseVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/BankAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class BankAdminCgServiceImpl implements BankAdminCgService {

    @POST
    @Path("/getBankParameters")
    @Override
    public BankParametersAdminResponseVO getBankParameters(BankAdminRequestVO request) {
        return new BankParametersAdminResponseVO();
    }

    @POST
    @Path("/getBankCurrencyList")
    @Override
    public BankCurrenciesResponseVO getBankCurrencyList(BankAdminRequestVO request) {
        return new BankCurrenciesResponseVO();
    }
}
