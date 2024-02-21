import java.util.Scanner;
//Problem 1
public class Main {
    public static void main(String[] args) {
        System.out.println("Problem #1:");

        System.out.println("********             ***            *         *");
        System.out.println("*      *          *       *        ***       ***");
        System.out.println("*      *         *         *      *****     *   *");
        System.out.println("*      *        *           *       *      *     *");
        System.out.println("*      *        *           *       *     *       *");
        System.out.println("*      *        *           *       *      *     *");
        System.out.println("*      *         *         *        *       *   *");
        System.out.println("*      *          *       *         *        ***");
        System.out.println("********             ***            *         *");

//Problem 2 -- A little unclear on if each portion of the question was related, so I did two versions based on the directions provided. The second version is commented out.
        //This program performs a simple payroll calculation.
        System.out.println("Problem #2:");

        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int b = Obj.nextInt();
        int c = 3;

        int a = b + c;

    //Problem 2, version 2
        //int b = 5;
        //int c = 3;
        //int a = b + c;

//Problem 3

        System.out.println("Problem #3");

        System.out.println("Enter first integer: ");
        float B = Obj.nextInt();
        System.out.println("Enter second integer: ");
        float C = Obj.nextInt();

        float sum = B + C;
        float product = B * C;
        float difference = B - C;
        float quotient = B / C;

        System.out.println("The sum of your numbers is: " + sum);
        System.out.println("The product of your numbers is: " + product);
        System.out.println("The difference of your numbers is: " + difference);
        System.out.println("The quotient of your numbers is: " + quotient);

}}