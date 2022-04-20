import inter.Encryption;
import inter.impl.Cesar;
import inter.impl.InvalidTypeEncryption;
import inter.impl.Reverse;

public class EncryptionFactory {
    public Encryption getEncryption(String encryptionType, String encryptionText){
        if(encryptionType == null){
            return new InvalidTypeEncryption();
        }
        if(encryptionType.equalsIgnoreCase("Cesar")){
            return new Cesar(encryptionText);

        } else if(encryptionType.equalsIgnoreCase("Reverso")){
            return new Reverse(encryptionText);
        }
        return new InvalidTypeEncryption();
    }
}
