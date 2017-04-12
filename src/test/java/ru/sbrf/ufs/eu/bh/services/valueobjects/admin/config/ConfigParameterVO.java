package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config;


import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.ChannelTypeEnum;

public class ConfigParameterVO {

    private Boolean listValue;
    private String value;
    private String valueClass;
    private BankIdEnum bankId;
    private ChannelTypeEnum channelType;
    private String regExp;
    private String regExpDescription;
    private String categoryGroup;
    private String category;
    private String parameterName;
    private String description;
    private Boolean applied;
    private Boolean secured;

    public Boolean getListValue() {
        return listValue;
    }

    public void setListValue(Boolean listValue) {
        this.listValue = listValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueClass() {
        return valueClass;
    }

    public void setValueClass(String valueClass) {
        this.valueClass = valueClass;
    }

    public BankIdEnum getBankId() {
        return bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

    public ChannelTypeEnum getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelTypeEnum channelType) {
        this.channelType = channelType;
    }

    public String getRegExp() {
        return regExp;
    }

    public void setRegExp(String regExp) {
        this.regExp = regExp;
    }

    public String getRegExpDescription() {
        return regExpDescription;
    }

    public void setRegExpDescription(String regExpDescription) {
        this.regExpDescription = regExpDescription;
    }

    public String getCategoryGroup() {
        return categoryGroup;
    }

    public void setCategoryGroup(String categoryGroup) {
        this.categoryGroup = categoryGroup;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getParameterName() {
        return parameterName;
    }

    public Boolean getSecured() {
        return this.secured;
    }

    public void setSecured(Boolean secured) {
        this.secured = secured;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getApplied() {
        return applied;
    }

    public void setApplied(Boolean applied) {
        this.applied = applied;
    }

}
