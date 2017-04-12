package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client.ClientAdminRequestVO;

import java.math.BigInteger;
import java.util.Calendar;

public class GetClientAuditRequestVO extends ClientAdminRequestVO {

    private String message;
    private BigInteger eventId;
    private String sessionId;
    private String mGUID;
    private Calendar dateFrom;
    private Calendar dateTo;

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

}
