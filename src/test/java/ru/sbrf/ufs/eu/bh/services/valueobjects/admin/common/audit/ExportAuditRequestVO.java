package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

import java.util.Calendar;

public class ExportAuditRequestVO extends BankAdminRequestVO {

    private Calendar dateFrom;
    private Calendar dateTo;
    private String filename;

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

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
