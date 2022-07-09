package com.sda.zadanie2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {


    private final NameValidator nameValidator = new NameValidator();


    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

/*
*     public boolean isNameValid(final String name) {
        return name != null
                && name.length() > 0
                && !name.toUpperCase().equals(name)
                && !name.toLowerCase().equals(name);
    }
*
*
* */

    @Test
    @DisplayName("Should return true happy path")
    void shouldReturnTrue() {
        // given
        String name = "Michel";

        // when
        boolean valid = nameValidator.isNameValid(name);

        // then
        Assertions.assertTrue(valid);
    }

    @Test
    @DisplayName("Should return false if name s null")
    void shouldReturnFalseIfNameNull() {
        // given
        String name = null;

        // when
        boolean valid = nameValidator.isNameValid(name);

        // then
        Assertions.assertFalse(valid);
    }


    @ParameterizedTest
    @ValueSource(strings = { "Michel", "Suzi", "Bob"})
    @DisplayName("Should return true happy path")
    void shouldReturnTrueParametrized(String name) {

        // when
        boolean valid = nameValidator.isNameValid(name);

        // then
        Assertions.assertTrue(valid);
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "M", "u", "bob", "MICHEL", ""})
    @DisplayName("Should return false if name s null")
    void shouldReturnFalseIfNameNullParametrized(String name) {
        // when
        boolean valid = nameValidator.isNameValid(name);

        // then
        Assertions.assertFalse(valid);
    }

}