package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

import java.util.Calendar;

public class ClientInfoSearchVO extends BankAdminRequestVO {

    private String loginId;
    private String email;
    private String firstName;
    private String lastName;
    private String middleName;
    private String coreClientId;
    private String phoneNumber;
    private Calendar birthDate;

    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCoreClientId() {
        return this.coreClientId;
    }

    public void setCoreClientId(String coreClientId) {
        this.coreClientId = coreClientId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Calendar getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }
}