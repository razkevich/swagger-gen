package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.audit;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit.ExportAuditRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit.GetAuditRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit.GetAuditResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit.GetClientAuditRequestVO;

public interface AuditCgService {

    GetAuditResponseVO getAuditData(GetAuditRequestVO request);

    GetAuditResponseVO getClientAuditData(GetClientAuditRequestVO request);

    CommonResponseVO exportAuditData(ExportAuditRequestVO request);
}
