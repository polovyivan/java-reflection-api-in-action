package com.polovyi.ivan.tutorials.demo.slides.classobject;

public class ObtainClassObjectSlide1 {

    public static void main(String[] args) throws Exception {

        System.out.println("\nGet class for name");
        Class<?> account = Class.forName("com.polovyi.ivan.tutorials.Account");
        Class<?> personalAccount = Class.forName("com.polovyi.ivan.tutorials.PersonalAccount");

        System.out.println("account = " + account.getSimpleName());
        System.out.println("personalAccount = " + personalAccount.getSimpleName());

    }
}
