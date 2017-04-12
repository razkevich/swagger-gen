package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability;


import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class ServiceVO {

    private String serviceName;
    private String displayName;
    private BankIdEnum bankId;
    private Integer errorLimit;
    private Integer errorCount;
    private Calendar downtimeStart;
    private Calendar downtimeEnd;
    private Integer downtimeDuration;
    private Calendar errorLimitReachedTime;
    private Long id;
    private List<ServiceLocalizeTextVO> downtimeMessages;

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BankIdEnum getBankId() {
        return this.bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

    public Integer getErrorLimit() {
        return this.errorLimit;
    }

    public void setErrorLimit(Integer errorLimit) {
        this.errorLimit = errorLimit;
    }

    public Integer getErrorCount() {
        return this.errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public Calendar getDowntimeStart() {
        return this.downtimeStart;
    }

    public void setDowntimeStart(Calendar downtimeStart) {
        this.downtimeStart = downtimeStart;
    }

    public Calendar getDowntimeEnd() {
        return this.downtimeEnd;
    }

    public void setDowntimeEnd(Calendar downtimeEnd) {
        this.downtimeEnd = downtimeEnd;
    }

    public Integer getDowntimeDuration() {
        return this.downtimeDuration;
    }

    public void setDowntimeDuration(Integer downtimeDuration) {
        this.downtimeDuration = downtimeDuration;
    }

    public Calendar getErrorLimitReachedTime() {
        return this.errorLimitReachedTime;
    }

    public void setErrorLimitReachedTime(Calendar errorLimitReachedTime) {
        this.errorLimitReachedTime = errorLimitReachedTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ServiceLocalizeTextVO> getDowntimeMessages() {
        return this.downtimeMessages;
    }

    public void setDowntimeMessages(List<ServiceLocalizeTextVO> downtimeMessages) {
        this.downtimeMessages = downtimeMessages;
    }

    public void updateDatesWithTimezone(TimeZone tz) {
        if (downtimeStart != null)
            downtimeStart.setTimeZone(tz);
        if (downtimeEnd != null)
            downtimeEnd.setTimeZone(tz);
    }

    public boolean isInManualDowntimeInterval() {
        Calendar now = Calendar.getInstance();
        if (downtimeStart != null)
            return now.after(downtimeStart) && (downtimeEnd == null || now.before(downtimeEnd));

        return false;
    }

    public boolean isInAutoDowntimeInterval() {
        Calendar now = Calendar.getInstance();

        if (errorLimitReachedTime != null) {
            if (downtimeDuration != null) {
                Calendar timeToUnlock = Calendar.getInstance();
                timeToUnlock.setTime(errorLimitReachedTime.getTime());
                timeToUnlock.add(Calendar.MINUTE, downtimeDuration);

                return now.before(timeToUnlock);
            } else
                return true;
        } else
            return false;
    }

}
