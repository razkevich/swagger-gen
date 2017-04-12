package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;

public class PaymentOrderAdminFilterVO extends PaymentOrderClientAdminFilterVO {

    private Long clientId;
    private String clientLoginId;
    private String clientFirstName;
    private String clientLastName;
    private String clientMiddleName;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientLoginId() {
        return clientLoginId;
    }

    public void setClientLoginId(String clientLoginId) {
        this.clientLoginId = clientLoginId;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientMiddleName() {
        return clientMiddleName;
    }

    public void setClientMiddleName(String clientMiddleName) {
        this.clientMiddleName = clientMiddleName;
    }
}
