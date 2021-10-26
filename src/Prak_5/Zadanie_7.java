package Prak_5;

import java.util.Scanner;

public class Zadanie_7
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();

        int[] a = new int[number];
        int f = 2;
        int h = 1;
        while (number != 1) {
            if(number % f != 0){
                f++;
            }else{
                number = number / f;
                if(a[h-1] != f) {
                    a[h] = f;
                    h++;
                }
            }
        }
        System.out.print("1");
        for (int i = 1; i < h; i++){
            System.out.print(", " + a[i]);
        }
        //System.out.print(a.length);
    }
}
