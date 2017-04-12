package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements;

public class FormatSettingVO {

    private String fileFormat;
    private Boolean isDefault;

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
