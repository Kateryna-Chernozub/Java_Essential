package task1;

public class Main extends Printer{
    public static void main(String[] args) {
        Printer m = new Main();
        Printer p = new Printer();

        m.print("Україна");
        p.print("чорне" , "біле");
    }
}
