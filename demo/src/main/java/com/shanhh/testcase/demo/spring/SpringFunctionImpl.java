package com.shanhh.testcase.demo.spring;

import org.springframework.stereotype.Service;

/**
 * @author dan.shan
 * @since 2014-04-27 下午5:19
 */
@Service
public class SpringFunctionImpl implements SpringFramework {

    @Override
    public String springFunction() {
        return "success";
    }

}
