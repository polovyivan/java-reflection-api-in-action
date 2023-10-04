package com.polovyi.ivan.tutorials;

import java.time.LocalDate;
import java.util.Set;

public class PersonalAccount extends Account implements Payment {

    private String firstName;
    public String lastName;

    public PersonalAccount(String id,
            String name,
            String address,
            LocalDate createdAt,
            String firstName,
            String lastName) {
        super(id, name, address, createdAt);
        this.firstName = normalize(firstName);
        this.lastName = normalize(lastName);
    }

    private PersonalAccount() {
        super();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = normalize(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = normalize(lastName);
    }


    @Override
    public Set<PaymentMethod> getPaymentMethods() {
        return Set.of(PaymentMethod.VISA,
                PaymentMethod.MASTER,
                PaymentMethod.AMEX,
                PaymentMethod.DISCOVER,
                PaymentMethod.CASH);
    }

    @Deprecated
    public String getNormalizedName(String name) throws Exception {
        if (name == null) {
            throw new Exception();
        }
        return name.trim();
    }

    private String normalize(String name) {
        return name == null ? null : name.trim();
    }
}
