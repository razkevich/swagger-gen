package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.kav;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

import java.util.Calendar;

public class SetKAVSettingsRequestVO extends BankAdminRequestVO {

    private Integer scanFrequency;
    private Calendar scanDate;
    private Integer updateFrequency;
    private Calendar updateDate;
    private Boolean switchForClient;
    private String notificationText;

    public Integer getScanFrequency() {
        return scanFrequency;
    }

    public void setScanFrequency(Integer scanFrequency) {
        this.scanFrequency = scanFrequency;
    }

    public Calendar getScanDate() {
        return scanDate;
    }

    public void setScanDate(Calendar scanDate) {
        this.scanDate = scanDate;
    }

    public Integer getUpdateFrequency() {
        return updateFrequency;
    }

    public void setUpdateFrequency(Integer updateFrequency) {
        this.updateFrequency = updateFrequency;
    }

    public Calendar getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Calendar updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getSwitchForClient() {
        return switchForClient;
    }

    public void setSwitchForClient(Boolean switchForClient) {
        this.switchForClient = switchForClient;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

}
