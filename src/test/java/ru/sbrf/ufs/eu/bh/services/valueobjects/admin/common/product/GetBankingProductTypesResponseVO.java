package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.product;


import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class GetBankingProductTypesResponseVO extends CommonResponseVO {

    private List<String> type;

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }
}
