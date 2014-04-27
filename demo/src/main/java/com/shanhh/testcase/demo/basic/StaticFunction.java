package com.shanhh.testcase.demo.basic;

/**
 * @author dan.shan
 * @since 2014-04-27 下午4:55
 */
public class StaticFunction {

    /**
     * static 方法
     * @return
     */
    public static String staticFunction() {
        return "success";
    }

    /**
     * 抛出异常的方法
     * @return
     */
    public static int throwNumberFormatException() {
        return Integer.parseInt("not int");
    }

}
