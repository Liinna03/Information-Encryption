package inter.impl;

import inter.Encryption;

public class InvalidTypeEncryption implements Encryption {
    @Override
    public String encryptionText() {
       String message = "Por favor verifique que en el archivo de texto el  tipo de codificación sea o Cesar o Reverso";
       return message;
    }
}
