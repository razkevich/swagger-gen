package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank;


import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class BankCurrenciesResponseVO extends CommonResponseVO {

    private List<String> currencies;

    public List<String> getCurrencies() {
        return this.currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }
}
