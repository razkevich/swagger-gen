package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.logs;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.logs.GetLogRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.logs.GetLogResponseVO;

public interface LogCgService {

    GetLogResponseVO getLogData(GetLogRequestVO request);
}
