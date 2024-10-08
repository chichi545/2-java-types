package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        int digit;
        while (x != 0) {
            digit = x % 10;
            if (digit % 2 != 0){
                return "FALSE";
            }
            x = x / 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
