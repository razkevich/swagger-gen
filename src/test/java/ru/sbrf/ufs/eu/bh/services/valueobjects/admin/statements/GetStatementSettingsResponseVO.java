package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class GetStatementSettingsResponseVO extends CommonResponseVO {

    private String bankId;
    private String productType;
    private String productSubtype;
    private List<DeliverySettingVO> deliverySettingList;
    private List<FormatSettingVO> formatSettingList;
    private List<LanguageSettingVO> languageSettingList;
    private List<FrequencySettingVO> frequencySettingList;
    private MandatoryStatementVO mandatoryStatement;
    private List<OperationSettingVO> operationSettingList;
    private Integer numberAllowed;
    private String minimumFrequency;

    public String getMinimumFrequency() {
        return minimumFrequency;
    }

    public void setMinimumFrequency(String minimumFrequency) {
        this.minimumFrequency = minimumFrequency;
    }

    public Integer getNumberAllowed() {
        return numberAllowed;
    }

    public void setNumberAllowed(Integer numberAllowed) {
        this.numberAllowed = numberAllowed;
    }

    public List<OperationSettingVO> getOperationSettingList() {
        return operationSettingList;
    }

    public void setOperationSettingList(List<OperationSettingVO> operationSettingList) {
        this.operationSettingList = operationSettingList;
    }

    public MandatoryStatementVO getMandatoryStatement() {
        return mandatoryStatement;
    }

    public void setMandatoryStatement(MandatoryStatementVO mandatoryStatement) {
        this.mandatoryStatement = mandatoryStatement;
    }

    public List<FrequencySettingVO> getFrequencySettingList() {
        return frequencySettingList;
    }

    public void setFrequencySettingList(List<FrequencySettingVO> frequencySettingList) {
        this.frequencySettingList = frequencySettingList;
    }

    public List<LanguageSettingVO> getLanguageSettingList() {
        return languageSettingList;
    }

    public void setLanguageSettingList(List<LanguageSettingVO> languageSettingList) {
        this.languageSettingList = languageSettingList;
    }

    public List<FormatSettingVO> getFormatSettingList() {
        return formatSettingList;
    }

    public void setFormatSettingList(List<FormatSettingVO> formatSettingList) {
        this.formatSettingList = formatSettingList;
    }

    public List<DeliverySettingVO> getDeliverySettingList() {
        return deliverySettingList;
    }

    public void setDeliverySettingList(List<DeliverySettingVO> deliverySettingList) {
        this.deliverySettingList = deliverySettingList;
    }

    public String getProductSubtype() {
        return productSubtype;
    }

    public void setProductSubtype(String productSubtype) {
        this.productSubtype = productSubtype;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
}
