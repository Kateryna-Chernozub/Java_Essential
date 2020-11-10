package task0;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>(); //лист тільки для об'єктів класа Animal
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        //лист об'єктів класа Dog
        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        // test(listOfDogs); бо метод test() приймає тільки лист об'єктів класа Animal, щоб це запрацювало треба викор Wildcard
    }

    private static void test(List<? extends Animal> list) { //Wildcard. показує, що ми можемо поставити в метод тільки той лист, елементи якого є або Animal, або є наслідником класа Animal
     // Якщо: test(List<? super Animal> list) { - то, в цьому листі будуть всі елементи або класа Animal, або вищого класу, в даному випадку Object
        /*
        Object
        Animal
        Dog
        */

        // private static void test(List<Animal> list) { //на вхід приймає лист тварин
        // Якщо написати: test(List<?> list) - це означає що в цей метод можна передати лист будь-яких об'єктів
        //але, тоді конструкція: for (Animal animal : list) { - видає помилку, так як тепер вміст класу list не можемо розглядати як Animal, тобто
        //зараз вміст об'єкту list буде розглядатися як масив об'єктів, бо можемо передати сюди будь-який об'єкт

        //хочемо вивести на екран кожну тварину яка є в листі:
        for (Animal animal : list) {
            System.out.println(animal); //буде визиватись метод toString який обявлений в класі Object

            //Якщо тут викликати метод eat(), то виведе 4 рази текст з методу (двічі за Animal, і двічі за Dog)
        }
    }
}
