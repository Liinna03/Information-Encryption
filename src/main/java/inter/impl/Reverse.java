package inter.impl;

import inter.Encryption;

public class Reverse implements Encryption {
    private final String text;

    public Reverse(String text) {
        this.text = text;
    }

    @Override
    public String encryptionText() {
        StringBuilder str = new StringBuilder(text);
        StringBuilder reverse_text = str.reverse();
        return reverse_text.toString();
    }
}
