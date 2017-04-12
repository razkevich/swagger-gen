package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client;


public class ClientAddressInfoVO {

    private String address;
    private String country;
    private String houseNumber;
    private String houseNumberAdditional;
    private String region;
    private String town;
    private String zip;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseNumberAdditional() {
        return this.houseNumberAdditional;
    }

    public void setHouseNumberAdditional(String houseNumberAdditional) {
        this.houseNumberAdditional = houseNumberAdditional;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
