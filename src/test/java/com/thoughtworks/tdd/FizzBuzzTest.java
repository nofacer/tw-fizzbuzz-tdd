package com.thoughtworks.tdd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    private FizzBuzz FB;

    @BeforeEach
    void init() {
        FB = new FizzBuzz();
    }

    @Test
    void should_return_original_number_if_not_a_multiple_of_3_or_5_or_7() {
        int idx = 1;

        String expectResult = "1";
        String actualResult = FB.fizzBuzz(idx);
        assertEquals(expectResult, actualResult);
    }

    @Test
    void should_return_Fizz_if_is_a_multiple_of_3(){
        int idx=6;
        String expectResult = "Fizz";
        String actualResult = FB.fizzBuzz(idx);
        assertEquals(expectResult, actualResult);

    }
}