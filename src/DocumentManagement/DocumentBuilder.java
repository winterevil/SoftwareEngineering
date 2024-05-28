package DocumentManagement;

public interface DocumentBuilder {
    public DocumentBuilder setExtension(String extension);

    public DocumentBuilder setEncryption(String encryption);

    public Document BuildDoc();
}
