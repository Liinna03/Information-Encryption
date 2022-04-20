package inter.impl;

import inter.Encryption;

public class Cesar implements Encryption {
    private final String text;

    public Cesar(String text) {
        this.text = text;
    }

    @Override
    public String encryptionText() {
        int code;
        StringBuilder encoded_text = new StringBuilder();
        code = 4 % 26;
        for (int i = 0; i < text.length(); i++) {
            int aux = text.charAt(i) + code - 26;
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                if ((text.charAt(i) + code) > 'z') {
                    encoded_text.append((char) aux);
                } else {
                    encoded_text.append((char) (text.charAt(i) + code));
                }
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                if ((text.charAt(i) + code) > 'Z') {
                    encoded_text.append((char) aux);
                } else {
                    encoded_text.append((char) (text.charAt(i) + code));
                }
            }
        }
        return encoded_text.toString();
    }
}
