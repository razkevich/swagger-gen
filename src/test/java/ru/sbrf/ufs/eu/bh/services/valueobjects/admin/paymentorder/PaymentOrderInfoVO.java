package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;


import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.ChannelTypeEnum;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;

public class PaymentOrderInfoVO {

    private String beneficiaryModel;
    private String beneficiaryReferenceNumber;
    private String paymentPurposeDescription;
    private Long debitAccountId;
    private String beneficiaryAddress;
    private String beneficiaryCountry;
    private BigInteger id;
    private String currencyCode;
    private BigDecimal amount;
    private String description;
    private String beneficiaryAccountIBAN;
    private String beneficiaryAccountBankCode;
    private PaymentOrderAccountInfoVO debitAccount;
    private String beneficiaryAccountPrefix;
    private String decisionReason;
    private Calendar originationDate;
    private Calendar executionDate;
    private Calendar transferStatusLastUpdateDate;
    private Calendar decisionDate;
    private ChannelTypeEnum originChannelName;
    private List<PaymentOrderProcessingInfoVO> processingInfo;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public PaymentOrderAccountInfoVO getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(PaymentOrderAccountInfoVO debitAccount) {
        this.debitAccount = debitAccount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChannelTypeEnum getOriginChannelName() {
        return originChannelName;
    }

    public void setOriginChannelName(ChannelTypeEnum originChannelName) {
        this.originChannelName = originChannelName;
    }

    public String getBeneficiaryAccountIBAN() {
        return beneficiaryAccountIBAN;
    }

    public void setBeneficiaryAccountIBAN(String beneficiaryAccountIBAN) {
        this.beneficiaryAccountIBAN = beneficiaryAccountIBAN;
    }

    public Calendar getOriginationDate() {
        return originationDate;
    }

    public void setOriginationDate(Calendar originationDate) {
        this.originationDate = originationDate;
    }

    public Calendar getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Calendar executionDate) {
        this.executionDate = executionDate;
    }

    public List<PaymentOrderProcessingInfoVO> getProcessingInfo() {
        return processingInfo;
    }

    public void setProcessingInfo(List<PaymentOrderProcessingInfoVO> processingInfo) {
        this.processingInfo = processingInfo;
    }

    public String getBeneficiaryAccountBankCode() {
        return beneficiaryAccountBankCode;
    }

    public void setBeneficiaryAccountBankCode(String beneficiaryAccountBankCode) {
        this.beneficiaryAccountBankCode = beneficiaryAccountBankCode;
    }

    public String getBeneficiaryAccountPrefix() {
        return beneficiaryAccountPrefix;
    }

    public String getBeneficiaryModel() {
        return this.beneficiaryModel;
    }

    public void setBeneficiaryModel(String beneficiaryModel) {
        this.beneficiaryModel = beneficiaryModel;
    }

    public String getBeneficiaryReferenceNumber() {
        return this.beneficiaryReferenceNumber;
    }

    public void setBeneficiaryReferenceNumber(String beneficiaryReferenceNumber) {
        this.beneficiaryReferenceNumber = beneficiaryReferenceNumber;
    }

    public String getPaymentPurposeDescription() {
        return this.paymentPurposeDescription;
    }

    public void setPaymentPurposeDescription(String paymentPurposeDescription) {
        this.paymentPurposeDescription = paymentPurposeDescription;
    }

    public Long getDebitAccountId() {
        return this.debitAccountId;
    }

    public void setDebitAccountId(Long debitAccountId) {
        this.debitAccountId = debitAccountId;
    }

    public String getBeneficiaryAddress() {
        return this.beneficiaryAddress;
    }

    public void setBeneficiaryAddress(String beneficiaryAddress) {
        this.beneficiaryAddress = beneficiaryAddress;
    }

    public String getBeneficiaryCountry() {
        return this.beneficiaryCountry;
    }

    public void setBeneficiaryCountry(String beneficiaryCountry) {
        this.beneficiaryCountry = beneficiaryCountry;
    }


    public void setBeneficiaryAccountPrefix(String beneficiaryAccountPrefix) {
        this.beneficiaryAccountPrefix = beneficiaryAccountPrefix;
    }

    public Calendar getTransferStatusLastUpdateDate() {
        return transferStatusLastUpdateDate;
    }

    public void setTransferStatusLastUpdateDate(Calendar transferStatusLastUpdateDate) {
        this.transferStatusLastUpdateDate = transferStatusLastUpdateDate;
    }

    public Calendar getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(Calendar decisionDate) {
        this.decisionDate = decisionDate;
    }

    public String getDecisionReason() {
        return decisionReason;
    }

    public void setDecisionReason(String decisionReason) {
        this.decisionReason = decisionReason;
    }

}
