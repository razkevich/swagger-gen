package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.client;

public interface ClientSecurityAdminCgService {

    void closeClientSession();

    void getSessionList();

    void getClientSessions();
}
