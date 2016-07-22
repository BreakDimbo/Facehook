package com.limbo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Break.D on 7/22/16.
 */
public class TestApp {

    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("config/spring-common.xml");
        TestBean tb = (TestBean) cxt.getBean("testBean");
        System.out.println(tb.getName());
    }
}
