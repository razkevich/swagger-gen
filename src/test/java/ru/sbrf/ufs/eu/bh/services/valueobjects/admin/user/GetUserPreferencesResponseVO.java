package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;

@ApiModel(parent = CommonResponseVO.class)
public class GetUserPreferencesResponseVO extends CommonResponseVO {

    private BankIdEnum bankId;
    private UserPermissionsVO userPermissions;

    public BankIdEnum getBankId() {
        return bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

    public UserPermissionsVO getUserPermissions() {
        return userPermissions;
    }

    public void setUserPermissions(UserPermissionsVO userPermissions) {
        this.userPermissions = userPermissions;
    }
}
