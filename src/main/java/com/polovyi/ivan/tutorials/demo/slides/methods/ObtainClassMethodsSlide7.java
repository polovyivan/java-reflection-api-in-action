package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

public class ObtainClassMethodsSlide7 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain annotated return type of the method :");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method method = personalAccountClass.getMethod("getPaymentMethods");
        AnnotatedType annotatedReturnType = method.getAnnotatedReturnType();
        System.out.println("annotatedReturnType = " + annotatedReturnType);
    }
}
