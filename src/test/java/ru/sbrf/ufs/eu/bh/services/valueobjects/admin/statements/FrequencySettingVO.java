package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements;

public class FrequencySettingVO {

    private String frequency;
    private Boolean isDefault;

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
