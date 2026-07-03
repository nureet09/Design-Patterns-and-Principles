package FactoryMethodPattern;

public abstract class DocumentFactory {
    // The Factory Method
    public abstract Document createDocument();

    // An optional helper operation that operates on the Document product
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}