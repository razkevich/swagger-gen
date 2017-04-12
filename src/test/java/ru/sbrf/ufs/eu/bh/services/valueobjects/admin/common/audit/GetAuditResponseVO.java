package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class GetAuditResponseVO extends CommonResponseVO {

    private List<AuditEventVO> auditData;

    public List<AuditEventVO> getAuditData() {
        return this.auditData;
    }

    public void setAuditData(List<AuditEventVO> auditData) {
        this.auditData = auditData;
    }

}
