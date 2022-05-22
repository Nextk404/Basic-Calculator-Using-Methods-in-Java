

import java.util.Objects;
import java.util.Scanner;


public class CoutingBackwards {


    static void addition(int num1,int num2){

        System.out.println(num1 + num2);







    }

    static void subtraction(int num1,int num2){

        System.out.println(num1 - num2);
    }


    static void multiplication(int num1, int num2){



        System.out.println(num1 * num2);



    }

    static void division(int num1,int  num2){

        System.out.println(num1/num2);


    }

    public static void main(String[] args) {
        int firstnumber;
        int secondnumber;
        String operator;

        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter first num");
       firstnumber =  myobj.nextInt();
       System.out.println("Enter second num");
       secondnumber =  myobj.nextInt();
       System.out.println("Enter operator +|-|x|/");
       operator = myobj.next();

       if(Objects.equals(operator, "+")){
           addition(firstnumber,secondnumber);


       } else if (Objects.equals(operator, "-")) {
           subtraction(firstnumber,secondnumber);

       } else if (Objects.equals(operator,"x")) {
           multiplication(firstnumber,secondnumber);

       } else if (Objects.equals(operator,"/")) {
           division(firstnumber,secondnumber);

       } else {
           System.out.println("Invalid operator exiting program!");
       }

       }


    }

