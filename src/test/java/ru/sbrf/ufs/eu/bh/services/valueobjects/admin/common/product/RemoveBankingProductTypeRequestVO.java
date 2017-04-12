package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.product;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

import java.util.List;

public class RemoveBankingProductTypeRequestVO extends BankAdminRequestVO {

    private List<Long> type;
    private List<Long> subtype;

    public List<Long> getType() {
        return type;
    }

    public void setType(List<Long> type) {
        this.type = type;
    }

    public List<Long> getSubtype() {
        return subtype;
    }

    public void setSubtype(List<Long> subtype) {
        this.subtype = subtype;
    }
}
