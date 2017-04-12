package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;

public class BHClientVersionVO extends BankAdminRequestVO {

    private Long id;
    private Long numberOfDevices;
    private String version;
    private Boolean supported;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumberOfDevices() {
        return numberOfDevices;
    }

    public void setNumberOfDevices(Long numberOfDevices) {
        this.numberOfDevices = numberOfDevices;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getSupported() {
        return this.supported;
    }

    public void setSupported(Boolean supported) {
        this.supported = supported;
    }
}
