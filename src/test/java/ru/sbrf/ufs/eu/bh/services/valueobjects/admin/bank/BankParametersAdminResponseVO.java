package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank;


import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.BankIdEnum;

@ApiModel(parent = CommonResponseVO.class)
public class BankParametersAdminResponseVO extends CommonResponseVO {

    private BankIdEnum bankId;
    private String currencyCode;
    private String locale;
    private String timeZone;

    public BankIdEnum getBankId() {
        return bankId;
    }

    public void setBankId(BankIdEnum bankId) {
        this.bankId = bankId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
