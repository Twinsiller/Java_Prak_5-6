package Prak_5;

import java.util.Scanner;

public class Zadanie_8
{
    public static void main(String[] args)
    {
        System.out.print("Enter word: ");

        Scanner scan = new Scanner(System.in);
        String wordS = scan.nextLine();

        //System.out.println(wordS.compareTo("af"));

        StringBuilder wordSB = new StringBuilder(0);
        wordSB.append(wordS);

        StringBuilder wordSBr = new StringBuilder(0);
        wordSBr.append(wordS);
        wordSBr.reverse();

        //System.out.println(wordSB.compareTo(wordSBr));

        System.out.println(wordSB);
        System.out.println(wordSBr);

        System.out.println(wordSBr.substring(2));

        if(wordSB.compareTo(wordSBr) == 0) {
            System.out.println("YES");
            System.out.println(wordSB);
            System.out.println(wordSBr);
        }else{
            System.out.println("NO");
            System.out.println(wordSB);
            System.out.println(wordSBr);
        }
    }

}




