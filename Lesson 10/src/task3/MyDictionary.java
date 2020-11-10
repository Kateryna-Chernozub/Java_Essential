package task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 Создайте класс MyDictionary<TKey,TValue>.
 Реализуйте в простейшем приближении возможность использования его экземпляра.
 Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать
 метод добавления пар элементов, индексатор для получения значения элемента
 по указанному индексу и свойство только для чтения для получения общего
 количества пар элементов.
 */

public class MyDictionary<TKey, TValue> {
    Map<TKey, TValue> dictionary = new HashMap<>();

    public Map<TKey, TValue> getDictionary() {
        return dictionary;
    }

    public void addMeth(TKey key, TValue value) {
        dictionary.put(key, value);
    }

    public TValue indexOfMeth(TKey key) {
        return dictionary.get(key);
    }

    public int count() {
        return dictionary.size();
    }

    public static void main(String[] args) {
        MyDictionary<String, String> dict = new MyDictionary<>();
        dict.addMeth("123", "Hello");
        dict.addMeth("456", "World");

        System.out.println(dict.getDictionary());
        System.out.println("Index: " + dict.indexOfMeth("456"));
        System.out.println("Count: " + dict.count());
    }
}
