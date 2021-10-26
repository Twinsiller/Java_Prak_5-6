package Prak_6;

import java.util.*;

public class CombiningLists {
    public static void main(String[] args) {
        List<String> list_1 = new ArrayList<>();
        List<String> list_2 = new ArrayList<>();
        List<String> result = new ArrayList<>();

        list_1.add("Baga");
        list_1.add("Fred");
        list_1.add("Yula");
        list_1.add("Zen");
        System.out.println(list_1);

        list_2.add("Afer");
        list_2.add("Bred");
        list_2.add("Hyuga");
        list_2.add("Wula");
        System.out.println(list_2);

        int b = 0;

        int index_1, index_2;

        while (list_1.size() > 0 && list_2.size() > 0){

            index_1 = (int)list_1.get(0).charAt(b);
            index_2 = (int)list_2.get(0).charAt(b);

            if (index_1 > index_2){
                result.add(list_2.get(0));
                list_2.remove(0);
                b = 0;
            }else if (index_1 < index_2){
                result.add(list_1.get(0));
                list_1.remove(0);
                b = 0;
            }else{
                b++;
            }
            System.out.println(result + "     " + list_1.size() + "      " + list_2.size());
        }

        if (list_1.isEmpty()){
            while (!list_2.isEmpty()){
                result.add(list_2.get(0));
                list_2.remove(0);
            }
        }

        if (list_2.isEmpty()){
            while (!list_1.isEmpty()){
                result.add(list_1.get(0));
                list_1.remove(0);
            }
        }

        System.out.println("Main: " + result);

    }

}
