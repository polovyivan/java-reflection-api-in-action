package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Method;

public class ObtainClassMethodsSlide3 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain a private method in the class:");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method normalize = personalAccountClass.getDeclaredMethod("normalize", String.class);
        System.out.println("normalize = " + normalize.getName());
    }
}
