package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.product;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.producttype.BankingProductSubtypeUpdateVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.producttype.BankingProductTypeUpdateVO;

public class SaveOrUpdateBankingProductTypeRequestVO extends BankAdminRequestVO {

    private BankingProductTypeUpdateVO type;

    private BankingProductSubtypeUpdateVO subtype;

    public BankingProductTypeUpdateVO getType() {
        return type;
    }

    public void setType(BankingProductTypeUpdateVO type) {
        this.type = type;
    }

    public BankingProductSubtypeUpdateVO getSubtype() {
        return subtype;
    }

    public void setSubtype(BankingProductSubtypeUpdateVO subtype) {
        this.subtype = subtype;
    }
}
