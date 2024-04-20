package Seminar_13.Document;

public class DocumentAdapter implements Document {
    OldDocument oldDocument = new OldDocument();

    @Override
    public void openDocument() {
        oldDocument.openDocument();
    }

    @Override
    public void closeDocument() {
        oldDocument.closeDocument();
    }
}
