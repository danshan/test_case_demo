package com.shanhh.testcase.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * base class for test spring framework
 * @author dan.shan
 * @since 2014-04-27 下午5:24
 */
@ContextConfiguration(locations = {"classpath:/spring/applicationContext.xml"})
public class SpringFunctionImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private SpringFramework springFramework;

    @Test
    public void testSpringFunction() throws Exception {
        assertEquals("success", springFramework.springFunction());
    }

}
