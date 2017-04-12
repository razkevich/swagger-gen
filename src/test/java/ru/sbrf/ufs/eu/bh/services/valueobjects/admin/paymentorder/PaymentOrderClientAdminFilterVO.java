package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;

public class PaymentOrderClientAdminFilterVO {

    private BigInteger id;
    private String beneficiaryAccount;
    private BigDecimal amountFrom;
    private BigDecimal amountTo;
    private String currencyCode;
    private Calendar executionDateTo;
    private Calendar executionDateFrom;
    private Calendar originationDateTo;
    private Calendar originationDateFrom;

    public BigInteger getId() {
        return this.id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Calendar getOriginationDateTo() {
        return this.originationDateTo;
    }

    public void setOriginationDateTo(Calendar originationDateTo) {
        this.originationDateTo = originationDateTo;
    }

    public Calendar getOriginationDateFrom() {
        return this.originationDateFrom;
    }

    public void setOriginationDateFrom(Calendar originationDateFrom) {
        this.originationDateFrom = originationDateFrom;
    }

    public String getBeneficiaryAccount() {
        return this.beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public BigDecimal getAmountFrom() {
        return this.amountFrom;
    }

    public void setAmountFrom(BigDecimal amountFrom) {
        this.amountFrom = amountFrom;
    }

    public BigDecimal getAmountTo() {
        return this.amountTo;
    }

    public void setAmountTo(BigDecimal amountTo) {
        this.amountTo = amountTo;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Calendar getExecutionDateTo() {
        return this.executionDateTo;
    }

    public void setExecutionDateTo(Calendar executionDateTo) {
        this.executionDateTo = executionDateTo;
    }

    public Calendar getExecutionDateFrom() {
        return this.executionDateFrom;
    }

    public void setExecutionDateFrom(Calendar executionDateFrom) {
        this.executionDateFrom = executionDateFrom;
    }

}
