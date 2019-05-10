package com.thoughtworks.tdd;

public class FizzBuzz {
    public FizzBuzz(){

    }

    public String fizzBuzz(int idx){
        String result="";

        if(idx%3==0){
            result+="Fizz";
        }
        else if(idx%5==0){
            result+="Buzz";
        }
        else{
            result+=idx;
        }
        return result;
    }
}
