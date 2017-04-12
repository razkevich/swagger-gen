package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements;

public class LanguageSettingVO {

    private String language;
    private Boolean isDefault;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
