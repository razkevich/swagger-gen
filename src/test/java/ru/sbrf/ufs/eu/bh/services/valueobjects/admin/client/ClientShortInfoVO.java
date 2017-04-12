package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;

import java.util.Calendar;
import java.util.List;

@ApiModel(parent = CommonResponseVO.class, subTypes = ClientDetailedInfoVO.class)
public class ClientShortInfoVO extends CommonResponseVO {

    private String loginId;
    private String coreClientId;
    private Long clientId;
    private BankIdEnum bankId;
    private String phoneNumber;
    private String email;
    private Calendar lastLogonDate;
    private String firstName;
    private String lastName;
    private String middleName;
    private List<ClientAddressInfoVO> clientAddresses;
    private Calendar birthDate;
    private String namePrefix;
    private String titleBefore;
    private String titleAfter;
    private Boolean pep;
    private Calendar nationalIdExpiryDate;
    private String segment;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getCoreClientId() {
        return coreClientId;
    }

    public void setCoreClientId(String coreClientId) {
        this.coreClientId = coreClientId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public BankIdEnum getBankId() {
        return bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getLastLogonDate() {
        return lastLogonDate;
    }

    public void setLastLogonDate(Calendar lastLogonDate) {
        this.lastLogonDate = lastLogonDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public List<ClientAddressInfoVO> getClientAddresses() {
        return clientAddresses;
    }

    public void setClientAddresses(List<ClientAddressInfoVO> clientAddresses) {
        this.clientAddresses = clientAddresses;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getTitleBefore() {
        return titleBefore;
    }

    public void setTitleBefore(String titleBefore) {
        this.titleBefore = titleBefore;
    }

    public String getTitleAfter() {
        return titleAfter;
    }

    public void setTitleAfter(String titleAfter) {
        this.titleAfter = titleAfter;
    }

    public Boolean getPep() {
        return pep;
    }

    public void setPep(Boolean pep) {
        this.pep = pep;
    }

    public Calendar getNationalIdExpiryDate() {
        return nationalIdExpiryDate;
    }

    public void setNationalIdExpiryDate(Calendar nationalIdExpiryDate) {
        this.nationalIdExpiryDate = nationalIdExpiryDate;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }
}
