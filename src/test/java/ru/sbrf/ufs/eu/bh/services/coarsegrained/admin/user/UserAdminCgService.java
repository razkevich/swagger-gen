package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.user;

import ru.sbrf.swagger.gen.example.model.CommonRequestVO;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user.*;

public interface UserAdminCgService {

    CommonResponseVO setUserBank(SetUserBankAdminRequestVO request);

    CommonResponseVO getUserContextInfo(CommonRequestVO request);

    CommonResponseVO blockUser(UserAdminRequestVO request);

    CommonResponseVO unblockUser(UserAdminRequestVO request);

    GetUserListAdminResponseVO getUserList(GetUserListAdminRequestVO request);

    GetRoleListAdminResponseVO getRoleList(BankAdminRequestVO request);

    GetUserPreferencesResponseVO getUserPreferences(CommonRequestVO request);

    CommonResponseVO blockAllActiveUsers(BankAdminRequestVO request);

    CommonResponseVO unblockAllActiveUsers(BankAdminRequestVO request);

    void logout(CommonRequestVO request);
}
