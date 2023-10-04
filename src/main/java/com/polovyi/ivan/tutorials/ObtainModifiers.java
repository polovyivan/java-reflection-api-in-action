package com.polovyi.ivan.tutorials;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.LocalDate;

public class ObtainModifiers {

    public static void main(String[] args) throws NoSuchMethodException {
        PersonalAccount personalAccount = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        Class<? extends Account> personalAccountClass = personalAccount.getClass();

        System.out.println("Obtain class modifier");
        int personalAccountClassModifier = personalAccountClass.getModifiers();
        boolean isPersonalAccountClassModifierPublic = Modifier.isPublic(personalAccountClassModifier);
        System.out.println("isPersonalAccountClassModifierPublic = " + isPersonalAccountClassModifierPublic);

        System.out.println("\nCheck if a parent class is abstract");
        Class<?> superclass = personalAccountClass.getSuperclass();
        int superclassModifiers = superclass.getModifiers();
        boolean isSuperclassAbstract = Modifier.isAbstract(superclassModifiers);
        System.out.println("isSuperclassAbstract = " + isSuperclassAbstract);

        System.out.println("\nCheck if a method is private");
        Method normalizeMethod = personalAccountClass.getDeclaredMethod("normalize", String.class);
        int normalizeMethodModifiers = normalizeMethod.getModifiers();
        boolean isNormalizeMethodPrivate = Modifier.isPrivate(normalizeMethodModifiers);
        System.out.println("isNormalizeMethodPrivate = " + isNormalizeMethodPrivate);
    }
}
