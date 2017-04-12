package ru.sbrf.swagger.gen.example.model;

import io.swagger.annotations.ApiModel;

@ApiModel(subTypes = {TestAbstractRequestVO.class})
public class CommonRequestVO {
    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
