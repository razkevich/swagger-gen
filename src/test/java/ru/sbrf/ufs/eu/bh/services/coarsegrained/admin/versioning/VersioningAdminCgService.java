package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.versioning;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning.BHClientVersionListAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning.BHClientVersionListAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning.BHClientVersionVO;

public interface VersioningAdminCgService {

    String getBusinessHubVersion();

    CommonResponseVO updateSupportedVersion(BHClientVersionVO version);

    BHClientVersionListAdminResponseVO getSupportedVersionsList(BHClientVersionListAdminRequestVO request);

    CommonResponseVO createSupportedVersion(BHClientVersionVO version);
}
