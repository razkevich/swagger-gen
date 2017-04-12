package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;

import com.google.common.base.Objects;

import java.math.BigDecimal;
import java.util.Calendar;

public class ClientProductInfoVO {

    private String productAlias;
    private Boolean isVisibleMobile;
    private String productName;
    private String currencyCode;
    private String accountNumber;
    private Calendar openDate;
    private Calendar closeDate;
    private BigDecimal interestRate;
    private BigDecimal balanceAvailable;
    private BigDecimal balanceAvailableLC;
    private String holderName;
    private Calendar productStatusLastUpdateDate;

    public String getProductAlias() {
        return this.productAlias;
    }

    public void setProductAlias(String productAlias) {
        this.productAlias = productAlias;
    }

    public Boolean getIsVisibleMobile() {
        return this.isVisibleMobile;
    }

    public void setIsVisibleMobile(Boolean isVisibleMobile) {
        this.isVisibleMobile = isVisibleMobile;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Calendar getOpenDate() {
        return this.openDate;
    }

    public void setOpenDate(Calendar openDate) {
        this.openDate = openDate;
    }

    public Calendar getCloseDate() {
        return this.closeDate;
    }

    public void setCloseDate(Calendar closeDate) {
        this.closeDate = closeDate;
    }

    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getBalanceAvailable() {
        return this.balanceAvailable;
    }

    public void setBalanceAvailable(BigDecimal balanceAvailable) {
        this.balanceAvailable = balanceAvailable;
    }

    public BigDecimal getBalanceAvailableLC() {
        return this.balanceAvailableLC;
    }

    public void setBalanceAvailableLC(BigDecimal balanceAvailableLC) {
        this.balanceAvailableLC = balanceAvailableLC;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Calendar getProductStatusLastUpdateDate() {
        return this.productStatusLastUpdateDate;
    }

    public void setProductStatusLastUpdateDate(
            Calendar productStatusLastUpdateDate) {
        this.productStatusLastUpdateDate = productStatusLastUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientProductInfoVO that = (ClientProductInfoVO) o;
        return Objects.equal(productAlias, that.productAlias) &&
                Objects.equal(isVisibleMobile, that.isVisibleMobile) &&
                Objects.equal(productName, that.productName) &&
                Objects.equal(currencyCode, that.currencyCode) &&
                Objects.equal(accountNumber, that.accountNumber) &&
                Objects.equal(openDate, that.openDate) &&
                Objects.equal(closeDate, that.closeDate) &&
                Objects.equal(interestRate, that.interestRate) &&
                Objects.equal(balanceAvailable, that.balanceAvailable) &&
                Objects.equal(balanceAvailableLC, that.balanceAvailableLC) &&
                Objects.equal(holderName, that.holderName) &&
                Objects.equal(productStatusLastUpdateDate, that.productStatusLastUpdateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productAlias, isVisibleMobile, productName, currencyCode, accountNumber,
                openDate, closeDate, interestRate, balanceAvailable, balanceAvailableLC, holderName,
                productStatusLastUpdateDate);
    }
}
