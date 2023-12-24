import java.util.Arrays;

public class Mixed {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String first = "Hi you there?";
        int i, fact = 1;
        int n = 6;
        for (i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is " + fact);
        System.out.println("Simply multiply: " + 9 * 6);
        String name = " Hi Prajwal";
        System.out.println("Adding strings example: " + first + name);
        final float a = -6.05f;
        System.out.println(a);
        float f = 2e7f;
        System.out.println("To print float as an interger: " + (int) f);
        char example = 112;
        System.out.println("The ASCII letter is " + example);
        int x = 10;
        x *= 4;
        System.out.println("The result of self multiplication is " + x);
        String para = "Find where is \"e\" in me";
        System.out.println("The actual text is " + para);
        System.out.println("Indicate the position of given letter: " + para.indexOf("e")); // To check letter position
        System.out.println("Length of String: " + para.length()); // Indicate the length of the String
        // char result=para.charAt(7);
        System.out.println("Character at given number: " + para.charAt(7));
        String test1 = "Prajwal";
        String test2 = "Prajwal";
        int result = test1.compareToIgnoreCase(test2);
        System.out.println("Comparing the two strings ignoring case: " + result);
        // System.out.println(test1.compareToIgnoreCase(test2));
        String name1 = "Prajwal";
        String name2 = "Raju";
        System.out.println(name1 + " " + name2);
        /* hi this is going to be ignored */
        double g = Math.random();
        System.out.println(g);
        System.out.println(10 > 8);
        int o = 78;
        int p = 78;
        if (o > p) {
            System.out.println(o + " is greater " + p);
        } else if (p > o) {
            System.out.println(p + " is greater than " + o);
        } else {
            System.out.println("Both are equal");
        }
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number");
        }
        int point = 0;
        System.out.println("Printing numbers below");
        while (point <= 4) {
            System.out.println(point);
            point++;
        }
        System.out.println("Simply space");
        // fibonacci series//
        int fibonacci = 0, j, k = 10, l = 1, h;
        System.out.println(fibonacci);
        for (j = 0; j <= k; j++) {
            h = fibonacci;
            fibonacci = fibonacci + l;
            System.out.println(fibonacci);
            l = h;
        }
        // Arrays//
        String[] cars = { "Audi", "Tata", "BMW", "Benz", "Hyundai", "Maruti" };
        System.out.println(cars[2]);
        System.out.println("Array elements number: " + cars.length);
        System.out.println(cars[5]);
        cars[5] = "Austin Martin";
        System.out.println(cars[5]);
        System.out.println(Arrays.toString(cars));
        // Checking out for loop for array printing//
        for (String q : cars) {
            System.out.println(q);
        }
        // two dimensional array//
        int[][] group = { { 1, 2, 3, 8 }, { 4, 5, 6 } };
        int group1 = group[1][2];
        System.out.println(group1);
        // Print all elements using for loop
        for (int w = 0; w < group.length; w++) {
            for (int z = 0; z < group[w].length; z++) {
                System.out.println(group[w][z]);
            }
        }
    }
}
