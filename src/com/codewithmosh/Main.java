package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        /* 基本Hello World 輸出 與Primitive Types原始型別*/
//        System.out.println("Hello World!");
//        int age = 30;
//        long viewCount = 3_123_456_789L;
//        float price = 10.99F;
//        Date now = new Date();
//        now.getTime();
//        System.out.println(now);

        /* String 物件操作 */
//        String message = new String("Hello World");
//        String message = "Hello World" + "!!";
//        Boolean result = message.endsWith("!!");
//        Boolean result = message.startsWith("!!");
//        System.out.println(result);


//        Integer number = message.length();
//        System.out.println(number);
//
//        Integer number = message.indexOf("H");
//        Integer number = message.indexOf("e");
//        Integer number = message.indexOf("sky");
//        System.out.println(number);

//        String hello = message.replace("!","*");
//        System.out.println(hello);

//        String hello = message.toLowerCase();
//        String hello = message.toUpperCase();
//        System.out.println(hello);
//        System.out.println(message);

//        String message = "     Hello World" + "!!     ";
//        System.out.println(message.trim());
//        System.out.println(message);

        /* escape sequence 轉義序列 跳脫字元 */
//        String message = "Hello \"World\" ";
//        System.out.println(message);

        // c:\windows\work
//        String message = "c:\\windows\\work";
//        System.out.println(message);
//        String message = "c:\nwindows\\work";
//        System.out.println(message);
//        String message = "c:\twindows\\work";
//        System.out.println(message);

        /* Arrays 陣列操作 */
//        int number = 1;
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//
//        String numbers2 = Arrays.toString(numbers);
//        System.out.println(numbers2);

//        int[] numbers = {2, 3, 5, 1, 4};
//        String numbers2 = Arrays.toString(numbers);
//        System.out.println(numbers2);

        /* Arrays sort 陣列排序 */
//        int[] numbers = {2, 3, 5, 1, 4};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        /* Multi-Dimensional Arrays  多維陣列 */
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers));

//        int[][] numbers = { {1, 2, 3} ,{ 4, 5, 6} };
//        System.out.println(Arrays.deepToString(numbers));

        /* Constants */
//        final float PI = 3.14F;
//        PI =1;

        /* Arithmetic Expressions */
//        int result = 10 + 3;
//        System.out.println(result);
//        int result = 10 - 3;
//        System.out.println(result);
//        int result = 10 * 3;
//        System.out.println(result);
//        int result = 10 / 3;
//        System.out.println(result);

//        Double result = (double)10 / (double)3;
//        System.out.println(result);

//        int x = 1;
//        x++;
//        System.out.println(x);
//        int x = 1;
//        ++x;
//        System.out.println(x);


//        int x = 1;
//        int y = x++;
//        System.out.println(x);
//        System.out.println(y);

//        int x = 1;
//        int y = ++x;
//        System.out.println(x);
//        System.out.println(y);

//        int x = 1;
//        x = x + 2;
//        System.out.println(x);
//        int x = 1;
//        x += 2;
//        System.out.println(x);

        /* Order of Operations */
        /* Casting 轉型 */

        /* implicit casting 隱式轉換 or 自動轉換 */
        /* byte > short > int > long > float > double */
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);

//        double x = 1.1;
//        double y = x + 2;
//        System.out.println(y);

        /* explicit casting 顯式轉換 */
//        double x = 1.1;
//        int y = (int)x + 2;
//        System.out.println(y);


        /* String字串如何轉型 */
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;
//        System.out.println(y);

//        String x = "1.1";
//        double y = Double.parseDouble(x) + 2;
//        System.out.println(y);

        /* The Math Class  */
//        int result = Math.round(1.1F);
//        System.out.println(result);

//        int result = (int)Math.ceil(1.1F);
//        System.out.println(result);

//        int result = (int)Math.floor(1.1F);
//        System.out.println(result);

//        int result = Math.max(1,2);
//        System.out.println(result);

//        int result = Math.min(1,2);
//        System.out.println(result);

//        double result = Math.random();
//        System.out.println(result);

//        double result = Math.round(Math.random() * 100);
//        System.out.println(result);

//        int result = (int)Math.round(Math.random() * 100);
//        System.out.println(result);

        /* Formatting Numbers  */
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);

//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);
//        System.out.println(result);

//        String result = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(result);

        /* Reading Input */
//        Scanner scanner = new Scanner(System.in);
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age );

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age : ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age );

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name : ");
//        String name = scanner.next();
//        System.out.println("You are " + name );

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name : ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name );

        /* Project: Mortgage Calculator */

        /* Solution: Mortgage Calculator  */

        // final byte MONTHS_IN_YEAR = 12;
        // final byte PERCENT = 100;

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Principal:  ");
        // int principal = scanner.nextInt();


        // System.out.println("Annual Interest Rate:  ");
        // float annualInterest = scanner.nextFloat();
        // float monthlyInterest = annualInterest / PERCENT /MONTHS_IN_YEAR;

        // System.out.println("Period (Years):  ");
        // byte years = scanner.nextByte();
        // int numberOfPayments = years * MONTHS_IN_YEAR;

        // double  mortgage = principal
        //         * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        //         / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // String mortgageFormatted = NumberFormat.getCurrencyInstance();
        // System.out.println("Mortgage: " + mortgageFormatted);

        /*  Summary  */

        /*  Control Flow   */

        /*  Comparison Operators    */
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x > y);
//        System.out.println(x >= y);
//        System.out.println(x < y);
//        System.out.println(x <= y);

        /*  Logical Operators    */

//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

//        int temperature = 12;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);
//
//        /*  If Statements    */
    	
//    	  int temp = 32;
//        if (temp > 30){
//            System.out.println("It's out day");
//            System.out.println("Drink water");
//        }else if(temp >20 && temp <= 30){
//            System.out.println("Beautiful Day");
//        }else{
//            System.out.println("Cold Day");
//        }

        /*  Simplifying If Statements    */

//        int income = 120_000;
//        boolean hasHighIncome;
//        if(income > 100_000) {
//            hasHighIncome = true;
//        }else{
//            hasHighIncome = false;
//        }
//        System.out.println(hasHighIncome);


//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);
//
//        System.out.println(hasHighIncome);

        /*  The Ternary Operator    */
//        int income = 120_000;
//        String className;
//        if(income > 100_000)
//            className = "First";
//        else
//            className = "Economy";

//        int income = 120_000;
//        String className = "Economy";
//        if(income > 100_000)
//            className = "First";

//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy" ;
//        System.out.println(className);

        /* Switch Statements */
//        String role = "admin";
//        if (role == "admin"){
//            System.out.println("You're an admin");
//        }else if(role == "moderator"){
//            System.out.println("You're a moderator");
//        }else{
//            System.out.println("You're a guest");
//        }

//        String role = "admin";
//        switch (role){
//            case "admin" :
//                System.out.println("You're an admin");
//                break;
//            case "moderator" :
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }

        /* Exercise: FizzBuzz */

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0){
//            System.out.println("Fizz");
//        }else if(number % 3 == 0){
//            System.out.println("Buzz");
//        }else if(number % 5 == 0 && number % 3 == 0){
//            System.out.println("FizzBuzz");
//        }else{
//            System.out.println(number);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if(number % 5 == 0 && number % 3 == 0){
//            System.out.println("FizzBuzz");
//        }
//        else if (number % 5 == 0){
//            System.out.println("Fizz");
//        }
//        else if(number % 3 == 0){
//            System.out.println("Buzz");
//        }
//        else {
//            System.out.println(number);
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if(number % 5 == 0 ){
//            if(number % 3 == 0){
//                System.out.println("FizzBuzz");
//            }else{
//                System.out.println("Fizz");
//            }
//
//        }
//        else if(number % 3 == 0){
//            System.out.println("Buzz");
//        }
//        else {
//            System.out.println(number);
//        }

        /* For Loops */

//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello World!");
//        }
//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello World! " + i);
//        }

//        for (int i = 5; i > 0; i--){
//            System.out.println("Hello World! " + i);
//        }

        /* While Loops */

//        int i = 5;
//        while(i > 0){
//            System.out.println("Hello Wrold!" + i);
//            i--;
//        }

        /* 這樣是錯的 */
        //        while(input != "quit" ){
//
//        }
        /* 這樣是錯的 */

//        String input = "";
//
//        Scanner scanner = new Scanner(System.in);
//        while(!input.equals("quit") ){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }

        /* do...while loops */

//        do{
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//
//        }while(!input.equals("quit"));

        /* Break and Continue */

//        String input = "";
//
//        Scanner scanner = new Scanner(System.in);
//        while(!input.equals("quit") ){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if(!input.equals("quit")){
//                System.out.println(input);
//            }
//
//        }

//        String input = "";
//
//        Scanner scanner = new Scanner(System.in);
//        while(!input.equals("quit") ){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass")){
//                continue;
//            }
//            if(input.equals("quit")){
//                break;
//            }
//            System.out.println(input);
//        }


//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while(true) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass")){
//                continue;
//            }
//            if(input.equals("quit")){
//                break;
//            }
//            System.out.println(input);
//        }
        /* For-Each Loop */
//        String[] fruits = { "Apple", "Mango" , "orange" };

//        for (int i =0; i<fruits.length; i++){
//            System.out.println(fruits[i]);
//        }

//        String[] fruits = { "Apple", "Mango" , "orange" };
//        for(String fruit: fruits){
//            System.out.println(fruit);
//        }

        /* Project: Mortgage Calculator */

        /* Solution: Mortgage Calculator */

//         final byte MONTHS_IN_YEAR = 12;
//         final byte PERCENT = 100;
//
//        int principal = 0;
//        float monthlyInterest = 0;
//        int numberOfPayments = 0;
//
//         Scanner scanner = new Scanner(System.in);
//
//         while(true){
//             System.out.println("Principal:  ");
//             principal = scanner.nextInt();
//             if(principal >= 1000 && principal <= 1_000_000){
//                 break;
//             }
//             System.out.println("Enter a value between 1000 and 1000000");
//         }
//
//
//        while(true){
//            System.out.println("Annual Interest Rate:  ");
//            float annualInterest = scanner.nextFloat();
//            if(annualInterest >=1 && annualInterest <= 30){
//                monthlyInterest = annualInterest / PERCENT /MONTHS_IN_YEAR;
//                break;
//            }
//            System.out.println("Enter a value between 1 and 30");
//
//        }
//
//        while(true){
//            System.out.println("Period (Years):  ");
//            byte years = scanner.nextByte();
//            if(years >= 1 && years <= 30){
//                numberOfPayments = years * MONTHS_IN_YEAR;
//                break;
//            }
//            System.out.println("Enter a value between 1 and 30");
//        }
//
//
//         double  mortgage = principal
//                 * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                 / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//
//         String mortgageFormatted = NumberFormat.getCurrencyInstance(mortgage);
//         System.out.println("Mortgage: " + mortgageFormatted);

        /* Summary */

        /* Clean Coding */
















        /* Arrays */
        /* Arrays */


    }
}
