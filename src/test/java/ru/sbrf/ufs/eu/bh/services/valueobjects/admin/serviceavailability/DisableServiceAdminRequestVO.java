package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

import java.util.Calendar;

public class DisableServiceAdminRequestVO extends BankAdminRequestVO {

    private Calendar downtimeStart;
    private Long id;
    private Calendar downtimeEnd;

    public Calendar getDowntimeStart() {
        return this.downtimeStart;
    }

    public void setDowntimeStart(Calendar downtimeStart) {
        this.downtimeStart = downtimeStart;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDowntimeEnd() {
        return this.downtimeEnd;
    }

    public void setDowntimeEnd(Calendar downtimeEnd) {
        this.downtimeEnd = downtimeEnd;
    }

}
