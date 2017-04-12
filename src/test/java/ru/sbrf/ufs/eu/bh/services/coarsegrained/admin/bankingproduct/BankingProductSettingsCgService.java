package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.bankingproduct;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.product.*;

public interface BankingProductSettingsCgService {

    SaveOrUpdateBankingProductResponseVO saveOrUpdateBankingProduct(SaveOrUpdateBankingProductRequestVO request);

    RemoveBankingProductResponseVO removeBankingProduct(RemoveBankingProductRequestVO request);

    CommonResponseVO getBankingProductsList(BankAdminRequestVO request);

    CommonResponseVO getBankingProductLocaleList(BankAdminRequestVO request);

    CommonResponseVO getBankingProduct(GetBankingProductRequestVO request);

    GetBankingProductGroupListResponseVO getBankingProductGroupList(GetBankingProductRequestVO request);

    SaveOrUpdateBankingProductGroupResponseVO saveOrUpdateBankingProductGroup(SaveOrUpdateBankingProductGroupRequestVO request);

    RemoveBankingProductGroupResponseVO removeBankingProductGroup(RemoveBankingProductGroupRequestVO request);

    GetBankingProductByIdResponseVO getProductById(GetBankingProductByIdRequestVO request);

    GetBankingProductGroupResponseVO getBankingProductGroup(BankAdminRequestVO request);

    GetBankingProductTypesResponseVO getBankingProductTypeList(BankAdminRequestVO request);

    CommonResponseVO saveOrUpdateBankingProductType(SaveOrUpdateBankingProductTypeRequestVO request);

    CommonResponseVO removeBankingProductType(RemoveBankingProductTypeRequestVO request);
}