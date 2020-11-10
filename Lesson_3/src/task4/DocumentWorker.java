package task4;

public class DocumentWorker {

    public void openDocument() {
        System.out.println("Документ відкритий.");
    }

    public void editDocument() {
        System.out.println("Редагування документа доступне у версії Pro.");
    }

    public void saveDocument() {
        System.out.println("Збереження документа доступне у версії Pro.");
    }
}

class ProDocumentWorker extends DocumentWorker{
    @Override
    public void editDocument() {
        System.out.println("Документ відредаговано.");
    }

    public void saveDocument() {
        System.out.println("Документ збережений в старому форматі, збереження в інших форматах доступне в версії Експерт.");
    }
}

class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public void saveDocument() {
        System.out.println("Документ збережений в новому форматі.");
    }
}
