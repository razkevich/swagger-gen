package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.user;

import ru.sbrf.swagger.gen.example.model.CommonRequestVO;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/UserAdminCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class UserAdminCgServiceImpl implements UserAdminCgService {

    @Override
    @POST
    @Path("/setUserBank")
    public CommonResponseVO setUserBank(SetUserBankAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @Override
    @POST
    @Path("/getUserContextInfo")
    public CommonResponseVO getUserContextInfo(CommonRequestVO request) {
        return new CommonResponseVO();
    }

    @Override
    @POST
    @Path("/blockUser")
    public CommonResponseVO blockUser(UserAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @Override
    @POST
    @Path("/unblockUser")
    public CommonResponseVO unblockUser(UserAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @Override
    @POST
    @Path("/getUserList")
    public GetUserListAdminResponseVO getUserList(GetUserListAdminRequestVO request) {
        return new GetUserListAdminResponseVO();
    }

    @Override
    @POST
    @Path("/getRoleList")
    public GetRoleListAdminResponseVO getRoleList(BankAdminRequestVO request) {
        return new GetRoleListAdminResponseVO();
    }

    @Override
    @POST
    @Path("/getUserPreferences")
    public GetUserPreferencesResponseVO getUserPreferences(CommonRequestVO request) {
        return new GetUserPreferencesResponseVO();
    }

    @Override
    @POST
    @Path("/blockAllActiveUsers")
    public CommonResponseVO blockAllActiveUsers(BankAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @Override
    @POST
    @Path("/unblockAllActiveUsers")
    public CommonResponseVO unblockAllActiveUsers(BankAdminRequestVO request) {
        return new CommonResponseVO();
    }

    @Override
    @POST
    @Path("/logout")
    public void logout(CommonRequestVO request) {
    }
}
