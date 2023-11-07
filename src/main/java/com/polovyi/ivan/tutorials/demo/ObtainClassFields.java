package com.polovyi.ivan.tutorials.demo;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PaymentMethod;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class ObtainClassFields {

    public static void main(String[] args) throws Exception {
        System.out.println("\nGet all public fields");
        PersonalAccount personalAccount = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        Class<? extends Account> personalAccountClass = personalAccount.getClass();

        System.out.println("\nList all fields including private in the class:");
        Field[] privateFields = personalAccountClass.getDeclaredFields();
        Arrays.stream(privateFields).forEach(System.out::println);

        Field[] publicFields = personalAccountClass.getFields();
        System.out.println("\nList all public fields including from the supper class:");
        Arrays.stream(publicFields).forEach(System.out::println);

        System.out.println("\nObtain a private field by name:");
        Field firstName = personalAccountClass.getDeclaredField("firstName");
        System.out.println("firstName = " + firstName);

        System.out.println("\nObtain a public field by name:");
        Field lastName = personalAccountClass.getField("lastName");
        System.out.println("lastName = " + lastName);

        System.out.println("\nLast name type is: ");
        Class<?> type = lastName.getType();
        System.out.println("type = " + type);

        System.out.println("\nGet a value of a private field: ");
        firstName.setAccessible(true);
        String firstNameValue = (String) firstName.get(personalAccount);
        System.out.println("firstNameValue = " + firstNameValue);

        System.out.println("\nGet a value of a public field: ");
        String lastNameValue = (String) lastName.get(personalAccount);
        System.out.println("lastNameValue = " + lastNameValue);

        System.out.println("\nSet value to a private field firstName: ");
        // firstName.setAccessible(true); dont need here because it is already set on line 42
        firstName.set(personalAccount, "changedFirstName");
        System.out.println("Changed field firstName: " + personalAccount.getFirstName());

        System.out.println("\nSet value to a public field lastName: " + lastNameValue);
        lastName.set(personalAccount, "changedLastName");
        System.out.println("Changed field lastName: " + personalAccount.getLastName());

        System.out.println("\nEnum: ");
        Class<PaymentMethod> paymentMethodClass = PaymentMethod.class;
        boolean anEnum = paymentMethodClass.isEnum();
        System.out.println("is enum = " + anEnum);

        System.out.println("\nEnum fields: ");
        Field[] declaredFields = paymentMethodClass.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(System.out::println);
    }
}
