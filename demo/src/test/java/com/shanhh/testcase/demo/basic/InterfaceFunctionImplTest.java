package com.shanhh.testcase.demo.basic;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author dan.shan
 * @since 2014-04-27 下午5:05
 */
public class InterfaceFunctionImplTest {

    @Test(description = "测试实现接口的方法")
    public void testInterfaceFunction() throws Exception {
        assertEquals("success", new InterfaceFunctionImpl().interfaceFunction());
    }

}
