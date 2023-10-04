package com.polovyi.ivan.tutorials;

import java.time.LocalDate;
import java.util.Arrays;

public class ObtainInheritance {

    public static void main(String[] args) {
        PersonalAccount personalAccount = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        Class<? extends Account> personalAccountClass = personalAccount.getClass();

        System.out.println("\nObtain super class: ");
        Class<?> superclass = personalAccountClass.getSuperclass();
        System.out.println("superclass = " + superclass);

        System.out.println("\nObtain interfaces: ");
        Class<?>[] interfaces = personalAccountClass.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);
    }
}
