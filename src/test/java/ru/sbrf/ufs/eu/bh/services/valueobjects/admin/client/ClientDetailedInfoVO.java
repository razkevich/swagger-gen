package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;

import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(parent = ClientShortInfoVO.class)
public class ClientDetailedInfoVO extends ClientShortInfoVO {

    private List<ClientDeviceInfoVO> clientDevices;
    private List<ClientProductInfoVO> clientProducts;
    private List<ClientChannelInfoVO> clientChannels;
    private Boolean isOnline;

    public List<ClientDeviceInfoVO> getClientDevices() {
        return this.clientDevices;
    }

    public void setClientDevices(List<ClientDeviceInfoVO> clientDevices) {
        this.clientDevices = clientDevices;
    }

    public List<ClientProductInfoVO> getClientProducts() {
        return this.clientProducts;
    }

    public void setClientProducts(List<ClientProductInfoVO> clientProducts) {
        this.clientProducts = clientProducts;
    }

    public List<ClientChannelInfoVO> getClientChannels() {
        return this.clientChannels;
    }

    public void setClientChannels(List<ClientChannelInfoVO> clientChannels) {
        this.clientChannels = clientChannels;
    }

    public Boolean getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

}
