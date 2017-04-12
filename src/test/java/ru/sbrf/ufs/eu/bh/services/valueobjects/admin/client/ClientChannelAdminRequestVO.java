package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;


import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.ChannelTypeEnum;

public class ClientChannelAdminRequestVO extends ClientAdminRequestVO {

    private ChannelTypeEnum channelType;

    public ChannelTypeEnum getChannelType() {
        return this.channelType;
    }

    public void setChannelType(ChannelTypeEnum channelType) {
        this.channelType = channelType;
    }
}
