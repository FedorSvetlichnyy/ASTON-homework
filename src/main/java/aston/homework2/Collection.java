package aston.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");  // метод add
        list.add("Second");
        System.out.println(list);
        System.out.println(list.get(0));  // метод get
        System.out.println(list.size());  // метод size


        List<String> secondList = new ArrayList<>();
        secondList.addAll(list);  // метод addAll
        System.out.println(secondList);
        secondList.remove(0);  // метод remove
        System.out.println(secondList);
        System.out.println(secondList.size());




        //сортировка пуырьком
        int[] array = {9, 8, 1, 11, 10, 17, 16};
        System.out.println("Массив перед пузырьковой сортировки : " + Arrays.toString(array));

        // ниже можно вынести в отдельный метод
        boolean isSorted = false; //flag
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    System.out.println("Не отсортирован");
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println("Массив после пузырьковой сортировки : " + Arrays.toString(array));;

    }
}
