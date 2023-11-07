package com.polovyi.ivan.tutorials.demo.slides.modifiers;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Modifier;

public class ObtainModifiersSlide2 {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("\nCheck if a parent class is abstract");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Class<?> superclass = personalAccountClass.getSuperclass();
        int superclassModifiers = superclass.getModifiers();
        boolean isSuperclassAbstract = Modifier.isAbstract(superclassModifiers);
        System.out.println("isSuperclassAbstract = " + isSuperclassAbstract);

    }
}
