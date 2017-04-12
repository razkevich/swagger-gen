package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.serviceavailability;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability.DisableServiceAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability.EnableServiceAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability.GetServiceGroupsAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability.UpdateServicePropertiesAdminRequestVO;

public interface ServiceAvailabilityAdminCgService {

    GetServiceGroupsAdminResponseVO getServiceGroups(BankAdminRequestVO request);

    CommonResponseVO enableService(EnableServiceAdminRequestVO request);

    CommonResponseVO updateServiceProperties(UpdateServicePropertiesAdminRequestVO request);

    CommonResponseVO disableService(DisableServiceAdminRequestVO request);
}
