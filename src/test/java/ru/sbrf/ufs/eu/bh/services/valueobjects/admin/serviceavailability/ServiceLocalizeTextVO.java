package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability;


public class ServiceLocalizeTextVO {

    private String locale;
    private String text;

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
