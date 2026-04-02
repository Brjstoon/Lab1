package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1=0, n2=0, n3=0, n4=0, n5=0;


        //q1 Math
        System.out.println("Math \n ");


        System.out.println("Enter first number: ");
        n1 = input.nextInt();
        System.out.println("enter second number: ");
        n2 = input.nextInt();

        int sum=0, sub=0, mul=0, div=0, remind=0;

        sum = n1+n2;
        sub = n1-n2;
        mul = n1*n2;
        div = n1/n2;
        remind = n1%n2;
        System.out.println(n1+" + "+n2+" = " + sum);
        System.out.println(n1+" - "+n2+" = " + sub);
        System.out.println(n1+" x "+n2+" = " + mul);
        System.out.println(n1+" / "+n2+" = " + div);
        System.out.println(n1+" mod "+n2+" = " + remind);



        //q2 Multiplication table to 10
        System.out.println("\n Multiplication table to 10 \n ");

        System.out.println("Enter a number: ");
        n1 = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + n1 * i);
        }

        //q3 Circle
        System.out.println("\n Circle \n ");

        System.out.println("Enter the radius: ");
        double r = input.nextDouble();

        double per = 2 * r * 3.14159265359;
        double a = (r*r)* 3.14159265359;
        System.out.println("Perimeter is = " + per);
        System.out.println("Area is = "+ a);



        //q4 Average
        System.out.println("\n Average \n ");



        System.out.println("Enter the count of numbers:  ");
        int count = input.nextInt();
        sum =0;

        for (int i = 0; i < count; i++){
            System.out.println("Enter an integer: ");
            n4 = input.nextInt();
            sum += n4;

        }
        double avg = (double) sum / count;
        System.out.println("The average is: " + avg);


        //q5 Adds first two numbers and compare with third number
        System.out.println("\n Adds first two numbers and compare with third number \n ");

        System.out.println("Enter first number: ");
        n1 = input.nextInt();
        System.out.println("enter second number: ");
        n2 = input.nextInt();
        System.out.println("enter third number: ");
        n3 = input.nextInt();

        boolean res = false;

        if (n1 + n2 == n3){
            res = true;
        }
        System.out.println("The result is: " + res);



        //q6 Reverse a word
        System.out.println("\n Reverse a word \n ");


        String txt = input.nextLine();
        System.out.println("Enter a word: ");
        txt = input.nextLine();
        String rev = "";
        for (int i = txt.length()-1 ; i >= 0 ; i--){
            rev += txt.charAt(i);
        }
        System.out.println(rev);


        //q7  Even or odd
        System.out.println("\n Even or odd \n ");

        System.out.println("Enter a number: ");
        n1 = input.nextInt();
        if (n1 % 2 == 0){
            System.out.println("The number is even.");
        }else System.out.println("The number is odd.");


        //q8 Converting from  Centigrade to Fahrenheit
        System.out.println("\n Converting from  Centigrade to Fahrenheit \n ");


        System.out.println("Enter temperature in Centigrade:  ");
        double tem = input.nextDouble();
        double feh = (tem * 9/5)+32;
        System.out.println("Temperature in Fahrenheit is: " + feh);


        //q9 Character in the given index.
        System.out.println("\n Character in the given index. \n ");


        String txt2 = input.nextLine();
        System.out.println("Enter a string: ");
        txt2 = input.nextLine();
        System.out.println("Enter an index: ");
        int indx = input.nextInt();

        System.out.println(  txt2.charAt(indx)  );


        //q10  Rectangle.
        System.out.println("\n Rectangle. \n ");

        System.out.println("Enter the Width: ");
        double wdth = input.nextDouble();
        System.out.println("Enter the Height: ");
        double hight = input.nextDouble();

        a = wdth * hight;
        per = 2 * ( hight+wdth );

        System.out.println("Area is = "+ a);
        System.out.println("Perimeter is = " + per);


        //q11 Compare two numbers.
        System.out.println("\n Compare two numbers.    \n ");

        System.out.println("Enter first number: ");
        n1 = input.nextInt();
        System.out.println("enter second number: ");
        n2 = input.nextInt();

        if (n1 > n2){
            System.out.println(n1 + " > " + n2);
            System.out.println(n1 + " >= " + n2);
            System.out.println(n1 + " != " + n2);
        } else if (n1 < n2) {
            System.out.println(n1 + " < " + n2);
            System.out.println(n1 + " <= " + n2);
            System.out.println(n1 + " != " + n2);
        } else if (n1 == n2) {
            System.out.println(n1 + " = " + n2);
        }


        //q12  Converts seconds into xxH:xxM:xxS format
        System.out.println("\n Converts seconds into xxH:xxM:xxS format    \n ");

        System.out.println("Enter time in seconds: ");
        int time = input.nextInt();
        int hours = time / 3600;
        int minutes = (time / 3600) % 60;
        int sec = time % 60 ;

        System.out.println(hours + ":" + minutes + ":" + sec);


        //q13 Comparison between four numbers
        System.out.println("\n Comparison between four numbers   \n ");


        System.out.println("enter first number: ");
        n1 = input.nextInt();
        System.out.println("enter second number: ");
        n2 = input.nextInt();
        System.out.println("enter third number: ");
        n3 = input.nextInt();
        System.out.println("enter fourth number: ");
        n4 = input.nextInt();

        if (n1 == n2 && n2 == n3 && n3 == n4) {
            System.out.println("Numbers are equal!");
        }else System.out.println("Numbers are not equal!");


        //q14 Signed numbers
        System.out.println("\n Signed numbers  \n ");

        System.out.println("enter a number: ");
        n1 = input.nextInt();
        if (n1 > 0){
            System.out.println("Number is positive.");
        } else if (n1 == 0){
            System.out.println("Number is zero.");
        }else {
            System.out.println("Number is Negative.");
        }


        //q15 Enter numbers until user stops (Ends with -1)
        System.out.println("\n Enter numbers until user stops (Ends with -1)    \n ");


        int neg=0, pos=0, zero=0;
        do {
            System.out.println("Enter a number:  (type: -1 to end the loop)");
            n1 = input.nextInt();

            if (n1 > 0){
                pos ++;
            } else if (n1 == 0){
                zero ++;
            }else if (n1 != -1){
                neg ++;
            }
        }while (n1 != -1);
        System.out.println(pos + " positives");
        System.out.println(zero + " zeros");
        System.out.println(neg + " negatives");



        //q16 Integers reversed
        System.out.println("\n Integers reversed     \n ");


        System.out.println("Enter a number: ");
        n1 = input.nextInt();
        n2 = n1;
        int dig=0;
        count=0;

        do {
            n2 = n2 / 10;
            count++;
        }while (n2 != 0);

        while (count != 0) {
            dig = n1 % 10;
            n3 = n3 * 10 +  dig;
            n1 = n1 / 10;
            count--;
        }
        System.out.println(n3);



        //q17 Enter numbers until user stops, display the largest and smallest numbers entered.
        System.out.println("\n Enter numbers until user stops, display the largest and smallest numbers entered.   \n ");



        char choice;
        int largest=0, smallest=0;
        boolean firstInput = true;

        do {


            System.out.println("Enter a number: ");
            n1 = input.nextInt();

            if (firstInput){
                largest = n1;
                smallest = n1;
                firstInput = false;
            }
            if (n1 > largest){
                largest = n1;
            }
            if (n1 < smallest){
                smallest = n1;
            }
            System.out.println("If you want to stop enter (N): ");
            choice = input.next().charAt(0);

        }while (choice != 'n' && choice != 'N');

        System.out.println( "Large: "+ largest + " Small: " + smallest);



        //q18 Determine and print the number of times a character appears.
        System.out.println("\n Determine and print the number of times a character appears.  \n ");


        String txt3 = input.nextLine();
        System.out.println("Type a text: ");
        txt3 = input.nextLine();

        for (int i = 0 ; i < txt3.length() ; i++){
            System.out.print(txt3.charAt(i) + " ");
            if ( txt3.charAt(i) == 'a' || txt3.charAt(i) == 'A'){
                n5++;
            }
        }
        System.out.println("\n Number of a's: " + n5);


    }
}