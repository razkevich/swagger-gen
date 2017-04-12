package ru.sbrf.swagger.gen.example;

import ru.sbrf.swagger.gen.example.model.CommonResult;
import ru.sbrf.swagger.gen.example.model.TestConcreteRequestVO;
import ru.sbrf.swagger.gen.example.model.TestConcreteResponseVO;

import javax.ws.rs.*;
import java.util.Arrays;
import java.util.Calendar;

@Path("/TestCgService")
@Consumes({"application/json"})
@Produces({"application/json"})
public class TestCgServiceImpl implements TestCgService {

    @POST
    @Path("/testMethod")
    public TestConcreteResponseVO getBankCurrencyList(TestConcreteRequestVO request) {
        return getBankCurrencyListNoParam();
    }

    @GET
    @Path("/testMethodNoParam")
    public TestConcreteResponseVO getBankCurrencyListNoParam() {
        return new TestConcreteResponseVO(CommonResult.SUCCESS, Calendar.getInstance(), "GMT+3", Arrays.asList("a", "b", "c"), "hello");
    }

}
