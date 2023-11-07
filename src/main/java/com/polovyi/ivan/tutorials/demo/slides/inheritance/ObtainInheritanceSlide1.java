package com.polovyi.ivan.tutorials.demo.slides.inheritance;

import com.polovyi.ivan.tutorials.PersonalAccount;

public class ObtainInheritanceSlide1 {

    public static void main(String[] args) {
        System.out.println("\nObtain super class: ");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Class<?> superclass = personalAccountClass.getSuperclass();
        System.out.println("superclass = " + superclass);
    }
}
