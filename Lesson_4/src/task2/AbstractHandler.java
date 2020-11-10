package task2;

import java.util.Scanner;

public abstract class AbstractHandler {
    public abstract void open();
    public abstract void create();
    public abstract void change();
    public abstract void save();
}

class XMLHandler extends AbstractHandler{
    public void open() {
        System.out.println("Open XML document");
    }

    public void create() {
        System.out.println("Create XML document");
    }

    public void change() {
        System.out.println("Change XML document");
    }

    public void save() {
        System.out.println("Save XML document");
    }
}

class TXTHandler extends AbstractHandler{
    public void open() {
        System.out.println("Open TXT document");
    }

    public void create() {
        System.out.println("Create TXT document");
    }

    public void change() {
        System.out.println("Change TXT document");
    }

    public void save() {
        System.out.println("Save TXT document");
    }
}

class DOCHandler extends AbstractHandler{
    public void open() {
        System.out.println("Open DOC document");
    }

    public void create() {
        System.out.println("Create DOC document");
    }

    public void change() {
        System.out.println("Change DOC document");
    }

    public void save() {
        System.out.println("Save DOC document");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Please, write the document type:");

        Scanner scanner = new Scanner(System.in);
        String typeDoc = scanner.nextLine();

        String XML = "XML";
        String TXT = "TXT";
        String DOC = "DOC";

        if (typeDoc.equals(XML)) {
            AbstractHandler XMLDoc = new XMLHandler();
            XMLDoc.open();
            XMLDoc.create();
            XMLDoc.change();
            XMLDoc.save();
        }
        if (typeDoc.equals(TXT)) {
            AbstractHandler TXTDoc = new TXTHandler();
            TXTDoc.open();
            TXTDoc.create();
            TXTDoc.change();
            TXTDoc.save();
        }
        if (typeDoc.equals(DOC)) {
            AbstractHandler DOCDoc = new DOCHandler();
            DOCDoc.open();
            DOCDoc.create();
            DOCDoc.change();
            DOCDoc.save();
        } else {
            System.out.println("Document type is not correct");
        }
    }
}