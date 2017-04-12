package ru.sbrf.ufs.eu.bh.services.coarsegrained.admin.bank;

import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankAdminRequestVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankCurrenciesResponseVO;
import ru.sbrf.ufs.eu.bh.services.valueobjects.admin.bank.BankParametersAdminResponseVO;

public interface BankAdminCgService {

    BankParametersAdminResponseVO getBankParameters(BankAdminRequestVO request);

    BankCurrenciesResponseVO getBankCurrencyList(BankAdminRequestVO request);
}
