package Fundamentals;

import java.util.Scanner;

public class Fundamentals {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // datatype, operators, array
        int firstShortNum;
        int secondIntNum;
        // int[] cards = { 1, 2, 3, 5, 343 };
        char[] cards = { '1', 'r', '4', 'B', '8' };
        firstShortNum = 11; // testing value
        secondIntNum = 50; // testing value

        // float myFloatNumber = 10;

        secondIntNum = secondIntNum + 10;
        secondIntNum -= 5;
        secondIntNum /= 2;
        secondIntNum++;
        // secondIntNum--;

        int result = firstShortNum % secondIntNum;

        char myCharacter = 'A';
        // boolean statement = 10<5;
        // boolean statement = (3 + 1) != 4;
        boolean statement = processed(firstShortNum, secondIntNum);

        // asking the user to enter a value
        System.out.print("Please enter a number to be multiplied by 100: ");
        firstShortNum = myScanner.nextInt();
        // calling the method
        int newResult = mult(firstShortNum);

        System.out.println(firstShortNum);
        System.out.println(secondIntNum);
        System.out.println(result);
        System.out.println(myCharacter);
        System.out.println((statement));
        System.out.println((cards[3]));
        System.out.println(newResult);

    }

    // method
    static public boolean processed(int firstNum, int secondNum) {
        boolean answer = firstNum > secondNum;
        return answer;
    }

    static public int mult(int num) {
        num *= 100;
        return num;

    }

}