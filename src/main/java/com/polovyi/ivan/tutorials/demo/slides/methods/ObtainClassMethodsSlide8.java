package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class ObtainClassMethodsSlide8 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain generic return type of the method :");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method method = personalAccountClass.getMethod("getPaymentMethods");
        Type genericReturnType = method.getGenericReturnType();
        System.out.println("genericReturnType = " + genericReturnType);
    }
}
