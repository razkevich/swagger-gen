package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.serviceavailability;


import java.util.List;

public class ServiceGroupVO extends ServiceVO {

    private List<ServiceVO> dependentServices;
    private List<ServiceVO> affectingServices;

    public List<ServiceVO> getDependentServices() {
        return this.dependentServices;
    }

    public void setDependentServices(List<ServiceVO> dependentServices) {
        this.dependentServices = dependentServices;
    }

    public List<ServiceVO> getAffectingServices() {
        return this.affectingServices;
    }

    public void setAffectingServices(List<ServiceVO> affectingServices) {
        this.affectingServices = affectingServices;
    }

    public void actualizeAllServiceStatuses() {

    }


}
