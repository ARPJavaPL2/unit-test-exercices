package com.sda.zadanie2;

public class NameValidator {

    public boolean isNameValid(final String name) {
        return name != null
                && name.length() > 0
                && !name.toUpperCase().equals(name)
                && !name.toLowerCase().equals(name);
    }
}
