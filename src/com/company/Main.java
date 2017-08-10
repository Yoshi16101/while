package com.company;

public class Main {

    public static void main(String[] args) {
//While statement
        int count = 1;
        while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }
// While Statement 2
         count = 1;
        while(true){
        if(count == 5){
            break;
        }
            System.out.println("Count value is " + count);
            count++;

        }
// Do While Statement
        count = 1;
        do {
            System.out.println("Count Value was " + count);
            count++;
        } while (count != 6);


// Exercise

        int number = 5;
        int tic = 0;
        int finishNumber = 20;
        while (number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            tic++;
            if(tic >= 5) {
                break;
            
            }
        }}



        public static boolean isEvenNumber(int number) {
            if ((number % 2) == 0){
            return true;
            } else {
            return false;

    }
}}
