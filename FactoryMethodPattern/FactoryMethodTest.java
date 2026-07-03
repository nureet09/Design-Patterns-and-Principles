package FactoryMethodPattern;

public class FactoryMethodTest {
    public static void main(String[] args) {
        // Create factories for different document types
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        System.out.println("--- Testing Document Creation via Factory Method ---");

        // Use the factories to create and open documents
        wordFactory.openDocument();
        pdfFactory.openDocument();
        excelFactory.openDocument();
    }
}