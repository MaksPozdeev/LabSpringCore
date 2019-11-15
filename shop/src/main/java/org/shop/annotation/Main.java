package org.shop.annotation;

import org.shop.configuration.SystemConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);
        MyClass myClass = ctx.getBean(MyClass.class);
        System.out.println("I= " + myClass.getI());
    }

}
