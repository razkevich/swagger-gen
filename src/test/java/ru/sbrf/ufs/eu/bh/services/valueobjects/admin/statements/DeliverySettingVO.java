package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements;

public class DeliverySettingVO {

    private String deliveryChannel;
    private Boolean isDefault;

    public String getDeliveryChannel() {
        return deliveryChannel;
    }

    public void setDeliveryChannel(String deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
