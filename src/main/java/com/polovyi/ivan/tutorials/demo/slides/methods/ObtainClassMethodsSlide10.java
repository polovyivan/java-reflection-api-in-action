package com.polovyi.ivan.tutorials.demo.slides.methods;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ObtainClassMethodsSlide10 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain exceptions of the method :");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method method = personalAccountClass.getMethod("getNormalizedName", String.class);
        Class<?>[] getNormalizedNameMethodExceptionTypes = method.getExceptionTypes();
        Arrays.stream(getNormalizedNameMethodExceptionTypes).forEach(System.out::println);
    }
}
