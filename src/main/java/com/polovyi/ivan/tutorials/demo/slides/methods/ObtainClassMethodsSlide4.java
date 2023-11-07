package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Method;

public class ObtainClassMethodsSlide4 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain a public method by name:");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method getPaymentMethodsMethod = personalAccountClass.getMethod("getPaymentMethods");
        System.out.println("lastName = " + getPaymentMethodsMethod.getName());
    }
}
