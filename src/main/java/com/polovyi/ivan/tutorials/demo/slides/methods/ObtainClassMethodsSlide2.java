package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ObtainClassMethodsSlide2 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nList all public methods including from the supper class:");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method[] personalAccountClassMethods = personalAccountClass.getMethods();
        Arrays.stream(personalAccountClassMethods).forEach(System.out::println);
    }
}
