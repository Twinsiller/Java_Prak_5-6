package Prak_5;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        int a = 2;
        while ( a < number) {
            if (number % a == 0) {
                System.out.println("NO");
                break;
            }

            a++;
            if (number == a)  System.out.println("YES");
        }
    }
}