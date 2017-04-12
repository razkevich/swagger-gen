package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class GetUserListAdminRequestVO extends BankAdminRequestVO {

    private UserFilterVO userFilter;

    public UserFilterVO getUserFilter() {
        return userFilter;
    }

    public void setUserFilter(UserFilterVO userFilter) {
        this.userFilter = userFilter;
    }
}
