package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.logs;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.ChannelTypeEnum;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.device.DeviceInfoVO;

import java.math.BigInteger;
import java.util.Calendar;

public class LoggingEventVO {

    private String timestamp;
    private String formattedMessage;
    private String loggerName;
    private String levelString;
    private String threadName;
    private BigInteger referenceFlag;
    private String arg0;
    private String arg1;
    private String arg2;
    private String callerFilename;
    private String callerClass;
    private String callerMethod;
    private String callerLine;
    private BigInteger eventId;
    private BankIdEnum bankId;
    private String loginId;
    private String sessionId;
    private String mGUID;
    private DeviceInfoVO device;
    private Integer regCodeCount;
    private ChannelTypeEnum channelType;
    private Calendar logDate;
    private Calendar logDateUserTimeZone;

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFormattedMessage() {
        return this.formattedMessage;
    }

    public void setFormattedMessage(String formattedMessage) {
        this.formattedMessage = formattedMessage;
    }

    public String getLoggerName() {
        return this.loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public String getLevelString() {
        return this.levelString;
    }

    public void setLevelString(String levelString) {
        this.levelString = levelString;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public BigInteger getReferenceFlag() {
        return this.referenceFlag;
    }

    public void setReferenceFlag(BigInteger referenceFlag) {
        this.referenceFlag = referenceFlag;
    }

    public String getArg0() {
        return this.arg0;
    }

    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }

    public String getArg1() {
        return this.arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return this.arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public String getCallerFilename() {
        return this.callerFilename;
    }

    public void setCallerFilename(String callerFilename) {
        this.callerFilename = callerFilename;
    }

    public String getCallerClass() {
        return this.callerClass;
    }

    public void setCallerClass(String callerClass) {
        this.callerClass = callerClass;
    }

    public String getCallerMethod() {
        return this.callerMethod;
    }

    public void setCallerMethod(String callerMethod) {
        this.callerMethod = callerMethod;
    }

    public String getCallerLine() {
        return this.callerLine;
    }

    public void setCallerLine(String callerLine) {
        this.callerLine = callerLine;
    }

    public BigInteger getEventId() {
        return this.eventId;
    }

    public void setEventId(BigInteger eventId) {
        this.eventId = eventId;
    }

    public BankIdEnum getBankId() {
        return this.bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getMGUID() {
        return this.mGUID;
    }

    public void setMGUID(String mGUID) {
        this.mGUID = mGUID;
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

    public Calendar getLogDate() {
        return this.logDate;
    }

    public void setLogDate(Calendar logDate) {
        this.logDate = logDate;
    }

    public Calendar getLogDateUserTimeZone() {
        return logDateUserTimeZone;
    }

    public void setLogDateUserTimeZone(Calendar logDateUserTimeZone) {
        this.logDateUserTimeZone = logDateUserTimeZone;
    }
}
