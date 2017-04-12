package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user;


import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;

import java.util.List;

public class UserAdminInfoVO {

    private String firstName;
    private String lastName;
    private String middleName;
    private String login;
    private BankIdEnum bankId;
    private List<String> roles;
    private String email;
    private String status;
    private String ipAddress;
    private String portNumber;
    private List<String> separateRights;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public BankIdEnum getBankId() {
        return bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public List<String> getSeparateRights() {
        return separateRights;
    }

    public void setSeparateRights(List<String> separateRights) {
        this.separateRights = separateRights;
    }
}
