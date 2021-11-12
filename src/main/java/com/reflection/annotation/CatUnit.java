package com.reflection.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CatUnit {
    public static void invokeTestMethods(Object obj) {
        Method[] listOfMethods = obj.getClass().getDeclaredMethods();
        try {
            for (Method i : listOfMethods) {
                for (Annotation x : i.getAnnotations()) {
                    if (x.annotationType().getSimpleName().equals("MethodTest")) {

                        i.invoke(obj);

                    }
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void assertValid(Object val1, Object val2) {
        if (val1.equals(val2)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");

        }
    }
}
