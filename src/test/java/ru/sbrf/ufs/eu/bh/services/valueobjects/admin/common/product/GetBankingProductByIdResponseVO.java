package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.product;


import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

@ApiModel(parent = CommonResponseVO.class)
public class GetBankingProductByIdResponseVO extends CommonResponseVO {

    private Long groupId;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
