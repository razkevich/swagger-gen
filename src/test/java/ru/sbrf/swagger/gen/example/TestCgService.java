package ru.sbrf.swagger.gen.example;

import ru.sbrf.swagger.gen.example.model.TestConcreteRequestVO;
import ru.sbrf.swagger.gen.example.model.TestConcreteResponseVO;

public interface TestCgService {

    TestConcreteResponseVO getBankCurrencyList(TestConcreteRequestVO request);

    TestConcreteResponseVO getBankCurrencyListNoParam();
}
