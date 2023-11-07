package com.polovyi.ivan.tutorials.demo;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PaymentMethod;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

public class ObtainClassMethods {

    public static void main(String[] args) throws Exception {
        // Get all public fields
        PersonalAccount personalAccount = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        Class<? extends Account> personalAccountClass = personalAccount.getClass();

        System.out.println("\nList all methods including private in the class:");
        Method[] personalAccountClassDeclaredMethods = personalAccountClass.getDeclaredMethods();
        Arrays.stream(personalAccountClassDeclaredMethods).forEach(System.out::println);

        Method[] personalAccountClassMethods = personalAccountClass.getMethods();
        System.out.println("\nList all public methods including from the supper class:");
        Arrays.stream(personalAccountClassMethods).forEach(System.out::println);

        System.out.println("\nObtain a private method in the class:");
        Method normalize = personalAccountClass.getDeclaredMethod("normalize", String.class);
        System.out.println("normalize = " + normalize.getName());

        System.out.println("\nObtain a public method by name:");
        Method getPaymentMethodsMethod = personalAccountClass.getMethod("getPaymentMethods");
        System.out.println("lastName = " + getPaymentMethodsMethod.getName());

        System.out.println("\nObtain qty of parameters in the method :");
        int parameterCount = getPaymentMethodsMethod.getParameterCount();
        System.out.println("parameterCount = " + parameterCount);

        System.out.println("\nObtain class containing the method :");
        Class<?> declaringClass = getPaymentMethodsMethod.getDeclaringClass();
        System.out.println("declaringClass = " + declaringClass.getName());

        System.out.println("\nObtain annotated return type of the method :");
        AnnotatedType annotatedReturnType = getPaymentMethodsMethod.getAnnotatedReturnType();
        System.out.println("annotatedReturnType = " + annotatedReturnType);

        System.out.println("\nObtain generic return type of the method :");
        Type genericReturnType = getPaymentMethodsMethod.getGenericReturnType();
        System.out.println("genericReturnType = " + genericReturnType);

        // System.out.println("\nDoes not return @Override annotations:");
        // Annotation[] declaredAnnotations = getPaymentMethodsMethod.getDeclaredAnnotations();
        // System.out.println("declaredAnnotations.length = " + declaredAnnotations.length);
        // Arrays.stream(declaredAnnotations).forEach(System.out::println);

        System.out.println("\nObtain annotations of the method :");
        Method getNormalizedNameMethod = personalAccountClass.getMethod("getNormalizedName", String.class);
        Annotation[] getFullNameDeclaredAnnotations = getNormalizedNameMethod.getDeclaredAnnotations();
        Arrays.stream(getFullNameDeclaredAnnotations).forEach(System.out::println);

        System.out.println("\nObtain exceptions of the method :");
        Class<?>[] getNormalizedNameMethodExceptionTypes = getNormalizedNameMethod.getExceptionTypes();
        Arrays.stream(getNormalizedNameMethodExceptionTypes).forEach(System.out::println);

        System.out.println("\nInvoke getPaymentMethodsMethod :");
        Set<PaymentMethod> returnFromGetPaymentsMethod = (Set<PaymentMethod>) getPaymentMethodsMethod.invoke(personalAccount);
        System.out.println("returnFromGetPaymentsMethod = " + returnFromGetPaymentsMethod);

        System.out.println("\nInvoke getPaymentMethodsMethod :");
        String getNormalizedNameMethodResult = (String) getNormalizedNameMethod.invoke(personalAccount, " Name ");
        System.out.println("getNormalizedNameMethodResult =" + getNormalizedNameMethodResult);
    }
}
