import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class SaveResultEncryption {
    private final String contenido;
    private final List entrada;

    public SaveResultEncryption(String contenido, List entrada) {
        this.contenido = contenido;
        this.entrada = entrada;
    }
    public void saveResultTxt(){
        try {
            String ruta = "result.txt";
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido + entrada);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
