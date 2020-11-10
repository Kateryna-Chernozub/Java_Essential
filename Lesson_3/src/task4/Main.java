package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String keyToStandard = " ";
        String keyToPro = "5643";
        String keyToEx = "We91f";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ключ:");
        String userKey = sc.nextLine();
        if (keyToPro.equals(userKey)) {
            System.out.println("Відкрито Про версію.");
            DocumentWorker pro = new ProDocumentWorker();
            pro.openDocument();
            pro.editDocument();
            pro.saveDocument();
        } if (keyToEx.equals(userKey)) {
            System.out.println("Відкрито Експерт версію.");
            DocumentWorker ex = new ExpertDocumentWorker();
            ex.openDocument();
            ex.editDocument();
            ex.saveDocument();
        } else {
            System.out.println("Відкрито стандартну версію.");
            DocumentWorker standard = new DocumentWorker();
            standard.openDocument();
            standard.editDocument();
            standard.saveDocument();
   //     } default : {
  //          System.out.println("Ключ не правильний.");
        }
    }
}