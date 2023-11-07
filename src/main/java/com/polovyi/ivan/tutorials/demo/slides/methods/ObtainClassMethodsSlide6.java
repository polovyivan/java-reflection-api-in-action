package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Method;

public class ObtainClassMethodsSlide6 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain class containing the method :");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method method = personalAccountClass.getMethod("getPaymentMethods");
        Class<?> declaringClass = method.getDeclaringClass();
        System.out.println("declaringClass = " + declaringClass.getName());
    }
}
