package com.shanhh.testcase.demo.basic;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

/**
 * @author dan.shan
 * @since 2014-04-27 下午5:00
 */
public class StaticFunctionTest {

    @Test(description = "测试静态方法")
    public void testStaticFunction() throws Exception {
        assertEquals("success", StaticFunction.staticFunction());
        assertNotNull(StaticFunction.staticFunction());
    }

    @Test(description = "指定期望抛出的异常", expectedExceptions = NumberFormatException.class)
    public void testThrowNumberFormatException() throws Exception {
        StaticFunction.throwNumberFormatException();
    }

}
