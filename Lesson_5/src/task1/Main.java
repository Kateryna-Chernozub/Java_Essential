package task1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // import ArrayList
        // creating a list
        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("Лиса Людмила Олексіївна");
        arrayList.add("Фортуна Тетяна Олександрівна");
        arrayList.add("Мосорко Юлія Олександрівна");
        arrayList.add("Карпюк Ігор Михайлович");
        arrayList.add("Козак Тетяна Миколаївна");
        arrayList.add("Шкриль Олексій Андрійович");

        System.out.println("Найкращий вчитель під індексом: " + arrayList.indexOf("Лиса Людмила Олексіївна"));
        System.out.println("Не найкращий вчитель під індексом: " + arrayList.indexOf("Карпюк Ігор Михайлович"));

        // output of the list of elements in a line through a comma
        System.out.println(arrayList);

        // output a list of items in a column
        // Сигнатура методу:
        //клас ітератор <тип> назва методу = посилання на лист.назва методу();
        //цикл (назва методу. метод(перебирає поки є наступний елемент))
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            String string = listIterator.next();
            System.out.println(string);
        }
    }
}
