package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.paymentorder;


public class UpdatePaymentOrderStatusAdminRequestVO extends PaymentOrderAdminRequestVO {

    private String decisionReason;
    private String login;

    public String getDecisionReason() {
        return decisionReason;
    }

    public void setDecisionReason(String decisionReason) {
        this.decisionReason = decisionReason;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
