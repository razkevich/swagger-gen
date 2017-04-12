package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class GetStatementSettingsRequestVO extends BankAdminRequestVO {

    private String productType;
    private String productSubtype;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductSubtype() {
        return productSubtype;
    }

    public void setProductSubtype(String productSubtype) {
        this.productSubtype = productSubtype;
    }
}
