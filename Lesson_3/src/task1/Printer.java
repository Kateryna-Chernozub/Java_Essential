package task1;

public class Printer {
    void print (String value){
        System.out.println((char)27 + "[33m" + value );
    }
    void print (String value1, String value2) {
        System.out.println((char)27 + "[30m" + value1 + "  " + (char) 27 + "[37m" + value2);
    }
}
