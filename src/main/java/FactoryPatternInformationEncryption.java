import java.util.List;
import inter.Encryption;

public class FactoryPatternInformationEncryption {
    public static void main(String[] args) {
        List<String> type_encryption_text;
        OpenTxtMessage c= OpenTxtMessage.getInformation("information.txt");
        String information = c.scannerInformation();
        if (information != null){
            OrganizeInformation x = new OrganizeInformation(information);
            type_encryption_text = x.splitInformation();
            String type_encryption = type_encryption_text.get(0);
            String text = type_encryption_text.get(1);
            EncryptionFactory encryptionFactory = new EncryptionFactory();
            Encryption encryption01 = encryptionFactory.getEncryption(type_encryption, text);
            String encryption_result = encryption01.encryptionText();
            SaveResultEncryption result = new SaveResultEncryption(encryption_result, type_encryption_text);
            result.saveResultTxt();
        }
    }
}