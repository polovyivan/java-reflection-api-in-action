package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ObtainClassMethodsSlide9 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain annotations of the method :");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method method = personalAccountClass.getMethod("getNormalizedName", String.class);
        Annotation[] getFullNameDeclaredAnnotations = method.getDeclaredAnnotations();
        Arrays.stream(getFullNameDeclaredAnnotations).forEach(System.out::println);
    }
}
