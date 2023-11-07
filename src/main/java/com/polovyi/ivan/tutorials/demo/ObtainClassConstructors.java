package com.polovyi.ivan.tutorials.demo;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Constructor;
import java.time.LocalDate;
import java.util.Arrays;

public class ObtainClassConstructors {

    public static void main(String[] args) throws Exception {
        System.out.println("\nGet all public constructors");
        Class<?> personalAccount = Class.forName("com.polovyi.ivan.tutorials.PersonalAccount");
        Constructor<?>[] constructors = personalAccount.getConstructors();
        System.out.println("Constructors:");
        Arrays.stream(constructors).forEach(System.out::println);

        System.out.println("\nGet all constructors including private");
        Constructor<?>[] declaredConstructors = personalAccount.getDeclaredConstructors();
        System.out.println("DeclaredConstructors:");
        Arrays.stream(declaredConstructors).forEach(System.out::println);

        System.out.println("\nGet private no arg constructor");
        Constructor<?> declaredNoArgConstructor = personalAccount.getDeclaredConstructor();
        System.out.println("declaredNoArgConstructor = " + declaredNoArgConstructor);

        System.out.println("\nGet parameter count:");
        int parameterCount = declaredNoArgConstructor.getParameterCount();
        System.out.println("parameterCount = " + parameterCount);

        System.out.println("\nCreate a new instance of a class using private constructor:");
        declaredNoArgConstructor.setAccessible(true);
        PersonalAccount personalAccountFromPrivateConstructor = (PersonalAccount) declaredNoArgConstructor.newInstance();
        System.out.println("personalAccountFromPrivateConstructor = " + personalAccountFromPrivateConstructor);

        System.out.println("\nGet public constructor with arguments: ");
        Constructor<?> declaredConstructor = personalAccount.getConstructor(String.class,
                String.class,
                String.class,
                LocalDate.class,
                String.class,
                String.class);
        System.out.println("declaredConstructor = " + declaredConstructor);

        System.out.println("\nGet parameter count of public constructor:");
        int declaredConstructorParameterCount = declaredConstructor.getParameterCount();
        System.out.println("declaredConstructorParameterCount = " + declaredConstructorParameterCount);

        System.out.println("\nCreate a new instance of a class using public constructor:");
        PersonalAccount personalAccountFromPublicConstructor = (PersonalAccount) declaredConstructor.newInstance("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        System.out.println("personalAccountFromPublicConstructor = " + personalAccountFromPublicConstructor);
    }
}
