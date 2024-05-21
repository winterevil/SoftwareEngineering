package DocumentManagement;

public class Client {

    public static void main(String[] args) {
        // Implement logic to prepare and submit a request
        NewDocument();
    }

    public static void NewDocument() {
        Document normalDocument = new NormalDoc().setExtension("txt").setEncryption("none").BuildDoc();
        Document confidentialDocument = new ConfidentialDoc().setExtension("zip").setEncryption("AES").BuildDoc();
    }

}
