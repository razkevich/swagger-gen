package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.bankingproduct;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.product.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/BankingProductSettingsCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class BankingProductSettingsCgServiceImpl implements BankingProductSettingsCgService {

    @POST
    @Path("/saveOrUpdateBankingProduct")
    @Override
    public SaveOrUpdateBankingProductResponseVO saveOrUpdateBankingProduct(SaveOrUpdateBankingProductRequestVO request) {
        return new SaveOrUpdateBankingProductResponseVO();
    }

    @POST
    @Path("/removeBankingProduct")
    @Override
    public RemoveBankingProductResponseVO removeBankingProduct(RemoveBankingProductRequestVO request) {
        return new RemoveBankingProductResponseVO();
    }

    @POST
    @Path("/getBankingProductsList")
    @Override
    public CommonResponseVO getBankingProductsList(BankAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getBankingProductLocaleList")
    @Override
    public CommonResponseVO getBankingProductLocaleList(BankAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getBankingProduct")
    @Override
    public CommonResponseVO getBankingProduct(GetBankingProductRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/getBankingProductGroupList")
    @Override
    public GetBankingProductGroupListResponseVO getBankingProductGroupList(GetBankingProductRequestVO request) {
        return new GetBankingProductGroupListResponseVO();
    }

    @POST
    @Path("/saveOrUpdateBankingProductGroup")
    @Override
    public SaveOrUpdateBankingProductGroupResponseVO saveOrUpdateBankingProductGroup(SaveOrUpdateBankingProductGroupRequestVO request) {
        return new SaveOrUpdateBankingProductGroupResponseVO();
    }

    @POST
    @Path("/removeBankingProductGroup")
    @Override
    public RemoveBankingProductGroupResponseVO removeBankingProductGroup(RemoveBankingProductGroupRequestVO request) {
        return new RemoveBankingProductGroupResponseVO();
    }

    @POST
    @Path("/getProductById")
    @Override
    public GetBankingProductByIdResponseVO getProductById(GetBankingProductByIdRequestVO request) {
        return new GetBankingProductByIdResponseVO();
    }

    @POST
    @Path("/getBankingProductGroup")
    @Override
    public GetBankingProductGroupResponseVO getBankingProductGroup(BankAdminRequestVO request) {
        return new GetBankingProductGroupResponseVO();
    }

    @POST
    @Path("/getBankingProductTypeList")
    @Override
    public GetBankingProductTypesResponseVO getBankingProductTypeList(BankAdminRequestVO request) {
        return new GetBankingProductTypesResponseVO();
    }

    @POST
    @Path("/saveOrUpdateBankingProductType")
    @Override
    public CommonResponseVO saveOrUpdateBankingProductType(SaveOrUpdateBankingProductTypeRequestVO request) {
        return new CommonResponseVO();
    }

    @POST
    @Path("/removeBankingProductType")
    @Override
    public CommonResponseVO removeBankingProductType(RemoveBankingProductTypeRequestVO request) {
        return new CommonResponseVO();
    }
}
