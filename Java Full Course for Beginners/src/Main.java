import java.awt.*;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        TITLES;
        Data types - primitive & reference data
        STRINGS
        ARRAYS
        Multi-Dim ARRAYS
        Constants & Operations
        Implicit (Automatic) Casting
        The Math Class
        Number Formatting
        Reading Input with Scanner
        Comparison Operators (&& - AND, || - OR)
        IF Statements
        For & While Loops
        */

        /*
        // Data types - primitive & reference data
        byte age = 33;
        long viewCounts = 3_256_785_777L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        Date now = new Date();
        now.getTime();
        System.out.println(now);
        */

        /*
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        // Result is 1 for y
        */

        /*
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        // Result is java.awt.Point[x=2,y=2]
        */

        /*
        // STRINGS
        String message = "Hello World!" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));

        System.out.println(message.length());

        System.out.println(message.indexOf("o"));
        System.out.println(message.indexOf("Hello"));
        System.out.println(message.indexOf("Sky")); // If there is no character inside, returns -1

        System.out.println(message.replace("!", "*"));
        System.out.println(message); // we see that message doesnt change even we use replace above
        // Because Strings are immutable

        System.out.println(message.toLowerCase());
        System.out.println(message.trim()); // remove the space at the beginning of the string

        String message1 = "Hello \"Gabri\" ";
        System.out.println(message1);

        // We want to assign link as a String which is: c:\Windows\... but reverse slash means different in Java
        // To solve this, we add double slash
        String link = "c:\\Windows\\System32\\";
        System.out.println(link); // result is c:\Windows\System32\

        String link2 = "c:\nWindows\\System32\\";
        System.out.println(link2); // "\n" put line below

        String link3 = "c:\tWindows\\System32\\";
        System.out.println(link3); // "\t" put space ("tab")
        */

        /*
        // ARRAYS
        int[] numbers2 = new int[5];
        System.out.println(numbers2);
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        System.out.println(Arrays.toString(numbers2));

        int[] numbers = {5, 7, 8, 3, 2};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        */

        /*
        // Multi-Dim ARRAYS
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int[][] numbers1 = {{1,2,3}, {4, 5, 6}};
        numbers1[0][0] = 7;
        System.out.println(Arrays.deepToString(numbers1));

        int[][][] numbers3 = new int[2][3][5];
        numbers3[0][0][0] = 1;
        System.out.println(Arrays.deepToString(numbers3));
        */

        /*
        // Constants & Operations
        final float pi = 3.14f;
        // pi = 1; with final we can not change the constant values

        int result = 10 / 3;
        System.out.println(result); // result is 3

        double result1 = 10 / 3;
        System.out.println(result1); // result is 3.0

        double result2 = (double)10 / 3;
        System.out.println(result2); // result is 3.3333333333333335

        double result3 = (double)10 / (double)3;
        System.out.println(result3); // result is 3.3333333333333335

        int a = 1;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        x = 1;
        int z = ++x;
        System.out.println(x);
        System.out.println(z);
        */

        /*
        // Implicit (Automatic) Casting
        // byte -> short -> int -> long -> float -> double (automatically converted)
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double x1 = 1.1;
        double y1 = x1 + 2;
        int y2 = (int)x1 + 2;
        System.out.println(y1);
        System.out.println(y2);

        String x2 = "1";
        // int y3 = (int)x2 + 2; // This gives error
        int y3 = Integer.parseInt(x2) + 2;
        System.out.println(y3);

        String x3 = "1.1";
        // int y4 = Integer.parseInt(x3) + 2; // This gives error
        double y4 = Double.parseDouble(x3) + 2;
        System.out.println(y3);
        */

        /*
        // The Math Class
        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);

        int result3 = Math.max(1, 3);
        System.out.println(result3);

        double result4 = Math.random();
        System.out.println(result4);

        double result5 = Math.random() * 100;
        System.out.println(result5);

        double result6 = Math.round(Math.random() * 100);
        System.out.println(result6);

        int result7 = (int) Math.round(Math.random() * 100);
        System.out.println(result7);

        int result8 = (int) Math.random() * 100;
        System.out.println(result8); // everytime we get 0

        int result9 = (int) (Math.random() * 100);
        System.out.println(result9);
        */

        /*
        // Number Formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat currencyInstance = NumberFormat.getPercentInstance();
        String result2 = currencyInstance.format(1.891);
        System.out.println(result2);

        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);
        */

        /*
        // Reading Input with Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age : ");
        byte age = scanner.nextByte();
        System.out.println("Your age is " + age);

        System.out.print("Name : ");
        String name = scanner.next().trim();
        System.out.println("Your name is " + name);

        String fullname = scanner.nextLine();
        System.out.println("Your last name is" + fullname);
        */

        /*
        // Comparison Operators
        int x = 1;
        int y = 1;
        System.out.println(x == y);
        System.out.println(x != y);
        y = 2;
        System.out.println(x <= y);

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
        */

        /*
        // IF Statements
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature?: ");

        int temp = scanner.nextInt();

        if (temp > 30){
            System.out.println("It is a hot day!");
        } else if (temp > 15) {
            System.out.println("It is a warm day!");
        }  else {
            System.out.println("It is a cold day!");
        }

        int income = 120_000;
        boolean hasHighIncome = false;
        // if (income > 100_000){hasHighIncome = true} // It can be written as;
        hasHighIncome = income > 100_000;
        System.out.println(hasHighIncome);

        String classname = "Economy";
        if (hasHighIncome) {classname = "First Class";};
        System.out.println(classname);

        String classname2 = income>100_000 ? "First Class" : "Second Class";
        System.out.println(classname2);
        */

        /*
        // For & While Loops

        for (int i = 0; i < 5; i++ ){
            System.out.println(i);
        }

        int a = 5;
        while (a > -1){
            System.out.println(a);
            a--;
        }

        Scanner sc = new Scanner(System.in);
        String input = "hamina";
        while (!input.equals("quit")){
            System.out.println(input);
            System.out.print("Write your input: ");
            input = sc.next();
        }

        do {
            System.out.print("Write your input: ");
            input = sc.next().toLowerCase();
            if (input.equals("pass")){
                continue;
            }
            if (input.equals("quit")){
                break;
            }
            System.out.println(input);
        } while (!input.equals("quit"));
        */

        /*
        // For -Each Loops

        String[] fruits = {"Mango", "Apple", "Orange"};
        for (String fruit : fruits) { System.out.println(fruit);}
        for (int i = 0; i < fruits.length; i++ ) { System.out.println(fruits[i]); }
        for (int i = fruits.length - 1; i > -1 ; i-- ) { System.out.println(fruits[i]); }
        */


    }
}