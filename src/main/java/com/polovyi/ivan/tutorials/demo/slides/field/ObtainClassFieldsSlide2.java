package com.polovyi.ivan.tutorials.demo.slides.field;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PaymentMethod;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class ObtainClassFieldsSlide2 {

    public static void main(String[] args) throws Exception {

        System.out.println("\nList all public fields including from the supper class:");
        Class<? extends Account> personalAccountClass = PersonalAccount.class;
        Field[] publicFields = personalAccountClass.getFields();
        Arrays.stream(publicFields).forEach(System.out::println);

    }
}
