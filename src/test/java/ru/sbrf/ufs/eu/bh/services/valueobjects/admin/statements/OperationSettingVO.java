package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements;

public class OperationSettingVO {

    private Boolean createAllowed;
    private Boolean updateAllowed;
    private Boolean deleteAllowed;
    private Boolean viewAllowed;
    private String productStatus;

    public Boolean getCreateAllowed() {
        return createAllowed;
    }

    public void setCreateAllowed(Boolean createAllowed) {
        this.createAllowed = createAllowed;
    }

    public Boolean getUpdateAllowed() {
        return updateAllowed;
    }

    public void setUpdateAllowed(Boolean updateAllowed) {
        this.updateAllowed = updateAllowed;
    }

    public Boolean getDeleteAllowed() {
        return deleteAllowed;
    }

    public void setDeleteAllowed(Boolean deleteAllowed) {
        this.deleteAllowed = deleteAllowed;
    }

    public Boolean getViewAllowed() {
        return viewAllowed;
    }

    public void setViewAllowed(Boolean viewAllowed) {
        this.viewAllowed = viewAllowed;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }
}
