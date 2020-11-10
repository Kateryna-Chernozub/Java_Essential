package task2;

public class Pupil {
    int studyRating;
    int readRating;
    int writeRating;
    int relaxRating;


    void study(){
        System.out.println("Some rating");
    }
    void read() {
        System.out.println("Some rating");
    }
    void write() {
        System.out.println("Some rating");
    }
    void relax() {
        System.out.println("Some rating");
    }
}


 class ExcellentPupil extends Pupil{
    @Override
    void study(){
        System.out.println("Excellent pupil:");
        System.out.println("Study level: 10/10");
    }

    void read(){
        System.out.println("Read level: 10/10");
    }
    void write(){
        System.out.println("Write level: 10/10");
    }
    void relax(){
        System.out.println("Relax level: 10/10");
    }
}


 class GoodPupil extends Pupil{
    @Override
    void study(){
        System.out.println("Good pupil: ");
        System.out.println("Study level: 7/10");
    }

    void read(){
        System.out.println("Read level: 8/10");
    }
    void write(){
        System.out.println("Write level: 6/10");
    }
    void relax(){
        System.out.println("Relax level: 9/10");
    }
}

class BadPupil extends  Pupil{
    @Override
    void study(){
        System.out.println("Bad pupil: ");
        System.out.println("Study level: 5/10");
    }

    void read(){
        System.out.println("Read level: 3/10");
    }
    void write(){
        System.out.println("Write level: 4/10");
    }
    void relax(){
        System.out.println("Relax level: 7/10");
    }
}