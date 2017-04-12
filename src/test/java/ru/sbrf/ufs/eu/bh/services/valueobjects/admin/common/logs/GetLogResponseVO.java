package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.common.logs;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class GetLogResponseVO extends CommonResponseVO {

    private List<LoggingEventVO> logData;

    public List<LoggingEventVO> getLogData() {
        return this.logData;
    }

    public void setLogData(List<LoggingEventVO> logData) {
        this.logData = logData;
    }

}
