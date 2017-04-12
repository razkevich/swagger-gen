package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.dictionary;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.dictionary.CutOffTimesAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.dictionary.UpdateCutOffTimesAdminRequestVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/DictionaryAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class DictionaryAdminCgServiceImpl implements DictionaryAdminCgService {

    @POST
    @Path("/getCutOffTimesDictionary")
    @Override
    public CutOffTimesAdminResponseVO getCutOffTimesDictionary(BankAdminRequestVO request) {
        return new CutOffTimesAdminResponseVO();
    }

    @POST
    @Path("/updateCutOffTimesDictionary")
    @Override
    public CommonResponseVO updateCutOffTimesDictionary(UpdateCutOffTimesAdminRequestVO request) {
        return new CommonResponseVO();
    }
}
