package com.polovyi.ivan.tutorials.demo.slides.constructor;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ObtainClassConstructorsSlide2 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nGet all constructors including private");
        Class<?> personalAccount = PersonalAccount.class;
        Constructor<?>[] declaredConstructors = personalAccount.getDeclaredConstructors();
        System.out.println("DeclaredConstructors:");
        Arrays.stream(declaredConstructors).forEach(System.out::println);
    }
}
