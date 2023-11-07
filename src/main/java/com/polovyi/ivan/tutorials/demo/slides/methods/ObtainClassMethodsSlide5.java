package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Method;

public class ObtainClassMethodsSlide5 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain number of parameters in the method :");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method method = personalAccountClass.getMethod("getPaymentMethods");
        int parameterCount = method.getParameterCount();
        System.out.println("parameterCount = " + parameterCount);
    }
}
