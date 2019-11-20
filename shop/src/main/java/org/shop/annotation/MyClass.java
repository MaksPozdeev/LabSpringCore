package org.shop.annotation;

public class MyClass {

    @InjectRandomInt(minValue = 3, maxValue = 11)
    private int i =0 ;

    int getI() {
        return i;
    }
}
