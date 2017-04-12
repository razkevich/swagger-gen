package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;

import java.util.Calendar;

public class ClientChannelInfoVO {

    private Calendar activationStatusUpdateDate;
    private Calendar statusUpdateDate;
    private Integer regCodeCount;
    private Boolean isOnline;
    private Integer regCodeLeft;

    public Calendar getActivationStatusUpdateDate() {
        return activationStatusUpdateDate;
    }

    public void setActivationStatusUpdateDate(Calendar activationStatusUpdateDate) {
        this.activationStatusUpdateDate = activationStatusUpdateDate;
    }

    public Calendar getStatusUpdateDate() {
        return statusUpdateDate;
    }

    public void setStatusUpdateDate(Calendar statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

    public Integer getRegCodeCount() {
        return regCodeCount;
    }

    public void setRegCodeCount(Integer regCodeCount) {
        this.regCodeCount = regCodeCount;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Integer getRegCodeLeft() {
        return regCodeLeft;
    }

    public void setRegCodeLeft(Integer regCodeLeft) {
        this.regCodeLeft = regCodeLeft;
    }
}
