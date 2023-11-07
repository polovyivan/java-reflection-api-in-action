package com.polovyi.ivan.tutorials.demo.slides.constructor;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ObtainClassConstructorsSlide1 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nGet all public constructors");
        Class<?> personalAccount = PersonalAccount.class;
        Constructor<?>[] constructors = personalAccount.getConstructors();
        System.out.println("Constructors:");
        Arrays.stream(constructors).forEach(System.out::println);
    }
}
