package ru.sbrf.swagger.gen.example.model;

import io.swagger.annotations.ApiModel;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankCurrenciesResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankParametersAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client.ClientShortInfoResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.client.ClientShortInfoVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.audit.GetAuditResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.logs.GetLogResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.product.*;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config.ConfigListResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config.GetConfigParameterAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.config.GetEnumValueListResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.dictionary.CutOffTimesAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.kav.GetKAVSettingsResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder.PaymentOrdersAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder.PaymentOrdersClientAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability.GetServiceGroupsAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements.GetStatementSettingsResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user.GetRoleListAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user.GetUserListAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.user.GetUserPreferencesResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning.BHClientVersionListAdminResponseVO;

import java.util.Calendar;

@ApiModel(subTypes = {TestAbstractResponseVO.class, GetUserListAdminResponseVO.class, GetConfigParameterAdminResponseVO.class,
        GetAuditResponseVO.class, ClientShortInfoVO.class, ClientShortInfoResponseVO.class, GetEnumValueListResponseVO.class,
        RemoveBankingProductResponseVO.class, CutOffTimesAdminResponseVO.class, GetBankingProductByIdResponseVO.class,
        GetStatementSettingsResponseVO.class, GetServiceGroupsAdminResponseVO.class, GetLogResponseVO.class,
        GetRoleListAdminResponseVO.class, GetBankingProductGroupResponseVO.class, GetKAVSettingsResponseVO.class,
        GetUserPreferencesResponseVO.class, BankCurrenciesResponseVO.class, GetBankingProductGroupListResponseVO.class,
        SaveOrUpdateBankingProductResponseVO.class, PaymentOrdersAdminResponseVO.class, GetBankingProductTypesResponseVO.class,
        SaveOrUpdateBankingProductGroupResponseVO.class, PaymentOrdersClientAdminResponseVO.class, RemoveBankingProductGroupResponseVO.class,
        ConfigListResponseVO.class, BHClientVersionListAdminResponseVO.class, BankParametersAdminResponseVO.class,
})
public class CommonResponseVO {

    private Integer resultCode;
    private String resultDescription;
    private Calendar currentBankDateTime;
    private String bankTimeZone;

    public CommonResponseVO(CommonResult r, Calendar currentBankDateTime, String bankTimeZone) {
        this(r);
        this.currentBankDateTime = currentBankDateTime;
        this.bankTimeZone = bankTimeZone;
    }

    public CommonResponseVO() {
        this(CommonResult.SUCCESS);
    }

    public CommonResponseVO(CommonResult r) {
        setResult(r);
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public Calendar getCurrentBankDateTime() {
        return currentBankDateTime;
    }

    public void setCurrentBankDateTime(Calendar currentBankDateTime) {
        this.currentBankDateTime = currentBankDateTime;
    }

    public String getBankTimeZone() {
        return bankTimeZone;
    }

    public void setBankTimeZone(String bankTimeZone) {
        this.bankTimeZone = bankTimeZone;
    }

    public void setResult(CommonResult result) {
        if (result != null) {
            resultCode = Integer.parseInt(result.getCode());
            resultDescription = result.getMessage();
        } else {
            throw new IllegalArgumentException("Result cannot be null");
        }
    }

    public void setResult(CommonResult result, Object... params) {
        if (result != null) {
            resultCode = Integer.parseInt(result.getCode());
            resultDescription = String.format(result.getMessage(), params);
        } else {
            throw new IllegalArgumentException("Result cannot be null");
        }
    }
}
