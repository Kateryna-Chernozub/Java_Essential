package task2;

import java.util.ArrayList;
import java.util.List;

/**
Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность
использования его экземпляра аналогично экземпляру класса List<T>.
Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления элемента, индексатор для получения
значения элемента по указанному индексу и свойство только для чтения
для получения общего количества элементов.
 */


public class MyList<T> {
    List<T>  list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void addMeth(T t) {
        list.add(t);
    }

    public int indexOfMeth(T t) {
        return list.indexOf(t);
    }

    public int count() {
        return list.size();
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.addMeth("123");
        list.addMeth("456");

        System.out.println(list.getList());
        System.out.println("Index: " + list.indexOfMeth("123"));
        System.out.println("Count: " + list.count());
    }
}
