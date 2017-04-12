package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.TimeZone;

public class GetAuditRequestVO extends BankAdminRequestVO {

    private String message;
    private BigInteger eventId;
    private String sessionId;
    private String loginId;
    private String mGUID;
    private Calendar dateFrom;
    private Calendar dateTo;
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

    public String getMGUID() {
        return this.mGUID;
    }

    public void setMGUID(String mGUID) {
        this.mGUID = mGUID;
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
