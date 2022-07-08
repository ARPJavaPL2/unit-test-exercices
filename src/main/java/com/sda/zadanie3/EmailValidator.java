package com.sda.zadanie3;

public class EmailValidator {

    public boolean validateEmail(String email) {
        return email != null && email.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}");
    }
}
