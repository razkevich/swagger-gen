package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.product;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class GetBankingProductByIdRequestVO extends BankAdminRequestVO {

    private Long productId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
