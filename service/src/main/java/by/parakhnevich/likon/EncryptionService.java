package by.parakhnevich.likon;

public interface EncryptionService {
    String encrypt (String password);

    boolean compareIgnoreEncryption(String encryptedPassword);
}
