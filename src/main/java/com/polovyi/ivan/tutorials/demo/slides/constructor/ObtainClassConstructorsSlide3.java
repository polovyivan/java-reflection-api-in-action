package com.polovyi.ivan.tutorials.demo.slides.constructor;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Constructor;

public class ObtainClassConstructorsSlide3 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nCreate a new instance of a class using private constructor:");
        Class<?> personalAccount = PersonalAccount.class;
        Constructor<?> declaredNoArgConstructor = personalAccount.getDeclaredConstructor();
        declaredNoArgConstructor.setAccessible(true);
        PersonalAccount personalAccountFromPrivateConstructor = (PersonalAccount) declaredNoArgConstructor.newInstance();
        System.out.println("personalAccountFromPrivateConstructor = " + personalAccountFromPrivateConstructor);
    }
}
