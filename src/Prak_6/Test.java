package Prak_6;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        list_1.add(1);
        list_1.add(3);
        list_1.add(4);
        list_1.add(7);
        System.out.println(list_1);

        list_2.add(2);
        list_2.add(3);
        list_2.add(3);
        list_2.add(8);
        System.out.println(list_2);

        //int index_1 = 0, index_2 = 0;

        while (list_1.size() > 0 && list_2.size() > 0){
            if (list_1.get(0) > list_2.get(0)){
                result.add(list_2.get(0));
                list_2.remove(0);
            }else{
                result.add(list_1.get(0));
                list_1.remove(0);
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
