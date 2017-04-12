package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.dictionary;

import ru.sbrf.swagger.gen.example.model.CommonResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.dictionary.CutOffTimesAdminResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.dictionary.UpdateCutOffTimesAdminRequestVO;

public interface DictionaryAdminCgService {

    CutOffTimesAdminResponseVO getCutOffTimesDictionary(BankAdminRequestVO request);

    CommonResponseVO updateCutOffTimesDictionary(UpdateCutOffTimesAdminRequestVO request);
}
