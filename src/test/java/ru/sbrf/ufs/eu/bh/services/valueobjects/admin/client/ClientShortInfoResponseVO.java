package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class ClientShortInfoResponseVO extends CommonResponseVO {

    private List<ClientShortInfoVO> clientInfoList;

    public List<ClientShortInfoVO> getClientInfoList() {
        return this.clientInfoList;
    }

    public void setClientInfoList(List<ClientShortInfoVO> clientInfoList) {
        this.clientInfoList = clientInfoList;
    }
}
