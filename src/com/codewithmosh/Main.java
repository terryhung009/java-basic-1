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
    	
    	












        /* Arrays */
        /* Arrays */


    }
}
