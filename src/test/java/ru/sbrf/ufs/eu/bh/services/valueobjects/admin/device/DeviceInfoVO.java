package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.device;


import java.util.Calendar;

public class DeviceInfoVO {

    private String model;
    private Long id;
    private Boolean isRooted;
    private Calendar registrationDate;
    private String appVersion;
    private Boolean isKasperskyOn;
    private String hardwareId;
    private String regCode;
    private Calendar regCodeExpirationTime;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Boolean getIsRooted() {
        return this.isRooted;
    }

    public void setIsRooted(Boolean isRooted) {
        this.isRooted = isRooted;
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

    public String getRegCode() {
        return this.regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public Calendar getRegCodeExpirationTime() {
        return this.regCodeExpirationTime;
    }

    public void setRegCodeExpirationTime(Calendar regCodeExpirationTime) {
        this.regCodeExpirationTime = regCodeExpirationTime;
    }
}
