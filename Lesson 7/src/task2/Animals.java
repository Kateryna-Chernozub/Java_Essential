package task2;

public enum Animals {
    tiger(1), zebra(2), dog(3);

//class fields
    public int age;

    Animals(int age) {
        this.age = age;
    }


    public String toString (){
            return this.name() + ": age - " + this.age;
    }
}

class Main{
    public static void main(String[] args) {
        Animals animal1 = Animals.tiger;
        System.out.println(animal1);

        Animals animal2 = Animals.dog;
        System.out.println(animal2);

//        Animals animals2 = new Animals();  не можна зробити екземпляр enum
    }
}
