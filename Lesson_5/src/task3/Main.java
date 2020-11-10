package task3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);

        System.out.println("BaseList: " + arrayList);

        System.out.print("Number +1: ");

        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            Integer integer = listIterator.next();

            System.out.print(integer + 1 + " ,");
        }
    }
}
