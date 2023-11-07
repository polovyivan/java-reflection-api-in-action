package com.polovyi.ivan.tutorials.demo.slides.inheritance;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.util.Arrays;

public class ObtainInheritanceSlide2 {

    public static void main(String[] args) {
        System.out.println("\nObtain interfaces: ");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Class<?>[] interfaces = personalAccountClass.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);
    }
}
