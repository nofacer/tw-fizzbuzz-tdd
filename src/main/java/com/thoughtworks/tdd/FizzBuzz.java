package com.thoughtworks.tdd;

public class FizzBuzz {
    public FizzBuzz() {

    }

    public String fizzBuzz(int idx) {
        String result = "";


        if (idx % 3 == 0) {
            result += "Fizz";
        }
        if (idx % 5 == 0) {
            result += "Buzz";
        }
        if (idx % 7 == 0) {
            result += "Whizz";
        }
        if (result.length() == 0) {
            result += idx;
        }
        return result;
    }
}
