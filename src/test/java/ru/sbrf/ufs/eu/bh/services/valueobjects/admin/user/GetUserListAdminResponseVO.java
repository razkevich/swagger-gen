package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class GetUserListAdminResponseVO extends CommonResponseVO {

    private List<UserAdminInfoVO> users;

    public List<UserAdminInfoVO> getUsers() {
        return users;
    }

    public void setUsers(List<UserAdminInfoVO> users) {
        this.users = users;
    }
}
