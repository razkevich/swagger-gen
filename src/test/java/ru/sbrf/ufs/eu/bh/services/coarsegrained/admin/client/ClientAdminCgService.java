package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.client;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client.*;

public interface ClientAdminCgService {

    ClientShortInfoResponseVO getClientList(ClientInfoSearchVO request);

    CommonResponseVO unregisterClientDevice(ClientDeviceAdminRequestVO request);

    CommonResponseVO terminateClientActiveSessions(ClientChannelAdminRequestVO request);

    ClientDetailedInfoVO getClientDetails(ClientAdminRequestVO request);

    CommonResponseVO updateClientChannelStatus(UpdateChannelStatusAdminRequestVO request);

    CommonResponseVO resetClientChannelDailySmsLimit(ClientChannelAdminRequestVO request);

    CommonResponseVO updateClientStatus(UpdateClientStatusAdminRequestVO request);
}
