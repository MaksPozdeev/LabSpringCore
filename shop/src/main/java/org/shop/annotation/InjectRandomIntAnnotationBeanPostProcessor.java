package org.shop.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;


public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().equals(Integer.TYPE)) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                if (annotation != null) {
                    int minValue = annotation.minValue();
                    int maxValue = annotation.maxValue();
                    int result = (maxValue - minValue) / 2;
                    field.setAccessible(true);
                    ReflectionUtils.setField(field, bean, result);
                }
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
