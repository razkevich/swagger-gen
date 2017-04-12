package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;

public class ClientDeviceAdminRequestVO extends ClientAdminRequestVO {

    private String mGUID;

    public String getMGUID() {
        return this.mGUID;
    }

    public void setMGUID(String mGUID) {
        this.mGUID = mGUID;
    }
}
