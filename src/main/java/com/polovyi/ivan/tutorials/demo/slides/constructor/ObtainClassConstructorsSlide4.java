package com.polovyi.ivan.tutorials.demo.slides.constructor;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Constructor;
import java.time.LocalDate;

public class ObtainClassConstructorsSlide4 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nCreate a new instance of a class using public constructor:");
        Class<?> personalAccount = PersonalAccount.class;
        Constructor<?> declaredConstructor = personalAccount.getConstructor(String.class,
                String.class,
                String.class,
                LocalDate.class,
                String.class,
                String.class);
        System.out.println("declaredConstructor = " + declaredConstructor);
        PersonalAccount personalAccountFromPublicConstructor = (PersonalAccount) declaredConstructor.newInstance("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        System.out.println("personalAccountFromPublicConstructor = " + personalAccountFromPublicConstructor);
    }
}
