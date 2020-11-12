package task0;

public class Animal {
    private int id;

    public Animal(){
    }

    public Animal(int id) {
         this.id = id;
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public String toString() {
         // return id; помилка
         // return id + ""
        return String.valueOf(id);  // у Стрінг визиваємо статичний метод вел'юОф, в аргумент якого ми ставимо ціле число і це ціле число конвертується в строку (обєкт класа Стрінг
    }
}
