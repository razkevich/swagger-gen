package ru.sbrf.ufs.eu.bh.services.valueobjects.admin.versioning;

import io.swagger.annotations.ApiModel;
import ru.sbrf.swagger.gen.example.model.CommonResponseVO;

import java.util.List;

@ApiModel(parent = CommonResponseVO.class)
public class BHClientVersionListAdminResponseVO extends CommonResponseVO {

    private List<BHClientVersionVO> versions;

    public List<BHClientVersionVO> getVersions() {
        return this.versions;
    }

    public void setVersions(List<BHClientVersionVO> versions) {
        this.versions = versions;
    }
}
