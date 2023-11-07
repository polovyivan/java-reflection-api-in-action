package com.polovyi.ivan.tutorials.demo.slides.field;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ObtainClassFieldsSlide1 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nList all fields including private in the class:");
        Class<? extends Account> personalAccountClass = PersonalAccount.class;
        Field[] privateFields = personalAccountClass.getDeclaredFields();
        Arrays.stream(privateFields).forEach(System.out::println);

    }
}
