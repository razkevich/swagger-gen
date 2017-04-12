package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.statement;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements.GetStatementSettingsRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements.GetStatementSettingsResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.statements.SetStatementSettingsRequestVO;

public interface StatementAdminCgService {

    CommonResponseVO setStatementSettings(SetStatementSettingsRequestVO request);

    GetStatementSettingsResponseVO getStatementSettings(GetStatementSettingsRequestVO request);
}
