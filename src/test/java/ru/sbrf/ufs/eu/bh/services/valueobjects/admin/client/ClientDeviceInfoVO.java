package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;

import com.google.common.base.Objects;

import java.util.Calendar;

public class ClientDeviceInfoVO {

    private String model;
    private Boolean isRooted;
    private Calendar lastLogonDate;
    private Calendar registrationDate;
    private String appVersion;
    private Boolean isKasperskyOn;
    private String hardwareId;
    private String mGUID;
    private String osType;
    private String osVersion;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getIsRooted() {
        return this.isRooted;
    }

    public void setIsRooted(Boolean isRooted) {
        this.isRooted = isRooted;
    }

    public Calendar getLastLogonDate() {
        return this.lastLogonDate;
    }

    public void setLastLogonDate(Calendar lastLogonDate) {
        this.lastLogonDate = lastLogonDate;
    }

    public Calendar getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Boolean getIsKasperskyOn() {
        return this.isKasperskyOn;
    }

    public void setIsKasperskyOn(Boolean isKasperskyOn) {
        this.isKasperskyOn = isKasperskyOn;
    }

    public String getHardwareId() {
        return this.hardwareId;
    }

    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    public String getMGUID() {
        return this.mGUID;
    }

    public void setMGUID(String mGUID) {
        this.mGUID = mGUID;
    }

    public String getOsType() {
        return this.osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientDeviceInfoVO that = (ClientDeviceInfoVO) o;
        return Objects.equal(model, that.model) &&
                Objects.equal(isRooted, that.isRooted) &&
                Objects.equal(lastLogonDate, that.lastLogonDate) &&
                Objects.equal(registrationDate, that.registrationDate) &&
                Objects.equal(appVersion, that.appVersion) &&
                Objects.equal(isKasperskyOn, that.isKasperskyOn) &&
                Objects.equal(hardwareId, that.hardwareId) &&
                Objects.equal(mGUID, that.mGUID) &&
                Objects.equal(osType, that.osType) &&
                Objects.equal(osVersion, that.osVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model, isRooted, lastLogonDate, registrationDate, appVersion, isKasperskyOn,
                hardwareId, mGUID, osType, osVersion);
    }
}
