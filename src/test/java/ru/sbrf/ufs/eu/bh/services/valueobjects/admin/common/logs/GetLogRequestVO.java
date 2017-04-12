package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.logs;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.ChannelTypeEnum;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.TimeZone;

public class GetLogRequestVO extends BankAdminRequestVO {

    private String message;
    private BigInteger eventId;
    private String sessionId;
    private String loginId;
    private BankIdEnum bankId;
    private Calendar dateFrom;
    private Calendar dateTo;
    private ChannelTypeEnum channelType;
    private String clientFirstName;
    private String clientLastName;
    private String clientMiddleName;

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

    public Calendar getDateFrom() {
        return this.dateFrom;
    }

    public void setDateFrom(Calendar dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Calendar getDateTo() {
        return this.dateTo;
    }

    public void setDateTo(Calendar dateTo) {
        this.dateTo = dateTo;
    }

    public ChannelTypeEnum getChannelType() {
        return this.channelType;
    }

    public void setChannelType(ChannelTypeEnum channelType) {
        this.channelType = channelType;
    }

    public String getClientFirstName() {
        return this.clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return this.clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientMiddleName() {
        return this.clientMiddleName;
    }

    public void setClientMiddleName(String clientMiddleName) {
        this.clientMiddleName = clientMiddleName;
    }

    public void updateDatesWithTimezone(TimeZone tz) {
        if (dateFrom != null && dateFrom.getTimeZone() != null)
            dateFrom.setTimeZone(tz);
        if (dateTo != null && dateTo.getTimeZone() != null)
            dateTo.setTimeZone(tz);
    }
}
