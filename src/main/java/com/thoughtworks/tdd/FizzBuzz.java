package com.thoughtworks.tdd;

public class FizzBuzz {
    public FizzBuzz(){

    }

    public String fizzBuzz(int idx){
        String result="";

        if(idx%3==0){
            result+="Fizz";
        }
        else{
            result+=idx;
        }
        return result;
    }
}
