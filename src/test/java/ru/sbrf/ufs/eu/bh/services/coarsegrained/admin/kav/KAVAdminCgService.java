package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.kav;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.kav.GetKAVSettingsRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.kav.GetKAVSettingsResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.kav.SetKAVSettingsRequestVO;

public interface KAVAdminCgService {

    CommonResponseVO setKAVSettings(SetKAVSettingsRequestVO request);

    GetKAVSettingsResponseVO getKAVSettings(GetKAVSettingsRequestVO request);
}
