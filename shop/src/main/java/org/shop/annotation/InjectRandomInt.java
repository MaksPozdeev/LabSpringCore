package org.shop.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectRandomInt {

    int minValue();

    int maxValue();

}
