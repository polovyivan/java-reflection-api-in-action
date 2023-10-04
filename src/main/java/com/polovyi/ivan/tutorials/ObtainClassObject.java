package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public class ObtainClassObject {

    public static void main(String[] args) throws Exception {
        System.out.println("\nGet class for name");
        Class<?> account = Class.forName("com.polovyi.ivan.tutorials.Account");
        Class<?> personalAccount = Class.forName("com.polovyi.ivan.tutorials.PersonalAccount");

        System.out.println("account = " + account.getSimpleName());
        System.out.println("personalAccount = " + personalAccount.getSimpleName());

        Class<?> account1 = Class.forName("com.polovyi.ivan.tutorials.Account");
        System.out.println("Point to the same object");
        System.out.println("References point to the dame object: " + (account == account1));

        System.out.println("\nA different way to get the class object using overload constructor");
        Class<?> account2 = Class.forName("com.polovyi.ivan.tutorials.Account", true, ObtainClassObject.class.getClassLoader());
        System.out.println("account2 = " + account2.getSimpleName());

        System.out.println("\nClass object can be obtained from the object itself");
        Class<? extends Account> personalAccountFromObject = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName").getClass();
        System.out.println("personalAccountFromObject = " + personalAccountFromObject.getSimpleName());

        System.out.println("\nThe .class Syntax");
        Class<Account> accountClassSyntax = Account.class;
        Class<PersonalAccount> personalAccountClassSyntax = PersonalAccount.class;
        System.out.println("accountClassSyntax = " + accountClassSyntax.getSimpleName());
        System.out.println("personalAccountClassSyntax = " + personalAccountClassSyntax.getSimpleName());

        System.out.println("\nVoid and primitives representations");
        Class<Void> voidClass = void.class;
        Class<Integer> integerClass = int.class;
        Class<Double> doubleClass = double.class;
        Class<int[]> intArrayClass = int[].class;
        Class<int[][]> intMultyDimentionalArrayClass = int[][].class;
    }
}
