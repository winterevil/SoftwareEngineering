package DocumentManagement;

public class ConfidentialDoc implements DocumentBuilder {
    private String Extension;
    private String Encryption;

    @Override
    public DocumentBuilder setExtension(String extension) {
        this.Extension = extension;
        return this;
    }

    @Override
    public DocumentBuilder setEncryption(String encryption) {
        this.Encryption = encryption;
        return this;
    }

    @Override
    public Document BuildDoc() {
        // TODO Auto-generated method stub
        return new Document(this.Extension, this.Encryption);
    }

}
