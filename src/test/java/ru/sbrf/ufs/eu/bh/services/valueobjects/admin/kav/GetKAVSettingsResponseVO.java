package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.kav;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;

import java.util.Calendar;

@ApiModel(parent = CommonResponseVO.class)
public class GetKAVSettingsResponseVO extends CommonResponseVO {

    private BankIdEnum bankId;
    private Integer scanFrequency;
    private Calendar scanDate;
    private Integer updateFrequency;
    private Calendar updateDate;
    private Boolean switchForClient;
    private String notificationText;

    public BankIdEnum getBankId() {
        return bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

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
