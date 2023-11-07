package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ObtainClassMethodsSlide1 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nList all methods including private in the class:");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method[] declaredMethods = personalAccountClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);
    }
}
