package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class UserAdminRequestVO extends BankAdminRequestVO {

    private String userLogin;

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
}
