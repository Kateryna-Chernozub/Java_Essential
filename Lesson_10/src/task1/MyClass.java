package task1;
/**
 Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(),
 который будет порождать экземпляры типа,
 указанного в качестве параметра типа (указателя места заполнения типом – Т).
*/


public class MyClass<T> {
    public static <T> void factoryMethod(T t1){
        System.out.println(t1.toString());
    }

    public static void main(String[] args) {
        factoryMethod(new Double(3.14));
    }
}
