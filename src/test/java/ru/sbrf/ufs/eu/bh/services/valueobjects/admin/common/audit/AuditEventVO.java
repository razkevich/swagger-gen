package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.ChannelTypeEnum;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.device.DeviceInfoVO;

import java.math.BigInteger;
import java.util.Calendar;

public class AuditEventVO {

    private String message;
    private BigInteger eventId;
    private String sessionId;
    private String loginId;
    private BankIdEnum bankId;
    private String mGUID;
    private Calendar dateTime;
    private DeviceInfoVO device;
    private Integer regCodeCount;
    private ChannelTypeEnum channelType;
    private String clientTimeZone;
    private String channel;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BigInteger getEventId() {
        return this.eventId;
    }

    public void setEventId(BigInteger eventId) {
        this.eventId = eventId;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public BankIdEnum getBankId() {
        return this.bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

    public String getMGUID() {
        return this.mGUID;
    }

    public void setMGUID(String mGUID) {
        this.mGUID = mGUID;
    }

    public Calendar getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }

    public DeviceInfoVO getDevice() {
        return this.device;
    }

    public void setDevice(DeviceInfoVO device) {
        this.device = device;
    }

    public Integer getRegCodeCount() {
        return this.regCodeCount;
    }

    public void setRegCodeCount(Integer regCodeCount) {
        this.regCodeCount = regCodeCount;
    }

    public ChannelTypeEnum getChannelType() {
        return this.channelType;
    }

    public void setChannelType(ChannelTypeEnum channelType) {
        this.channelType = channelType;
    }

    public String getClientTimeZone() {
        return this.clientTimeZone;
    }

    public void setClientTimeZone(String clientTimeZone) {
        this.clientTimeZone = clientTimeZone;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
