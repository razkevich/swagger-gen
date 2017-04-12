package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.config;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config.*;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.limit.SaveHardChannelLimitRequestVO;

public interface SfsConfigAdminCgService {

    CommonResponseVO updateParameter(UpdateConfigParameterAdminRequestVO request);

    ConfigListResponseVO getParametersList(ConfigListRequestVO request);

    GetConfigParameterAdminResponseVO getParameter(GetConfigParameterAdminRequestVO request);

    CommonResponseVO updateHardLimit(SaveHardChannelLimitRequestVO request);

    GetEnumValueListResponseVO getEnumValueList(GetEnumValueListRequestVO request);
}
