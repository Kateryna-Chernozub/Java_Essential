package task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(0, "hippopotamus");
        arrayList.add(1, "zebra");
        arrayList.add(2, "lion");
        arrayList.add(3, "tiger");
        arrayList.add(4, "bear");
        arrayList.add(5, "wolf");
        arrayList.add(6, "crocodile");
        arrayList.add(7, "fox");

        System.out.println(arrayList);
        System.out.println("Size: " + arrayList.size());

        arrayList.remove(1);
        arrayList.remove("tiger");
        arrayList.remove("wolf");
        arrayList.remove("fox");

        System.out.println("New size: " + arrayList.size());
        System.out.println(arrayList);

    }
}
