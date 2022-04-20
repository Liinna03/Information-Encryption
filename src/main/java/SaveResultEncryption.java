import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class SaveResultEncryption {
    private final String result;
    private final List original_information;

    public SaveResultEncryption(String result, List original_information) {
        this.result = result;
        this.original_information = original_information;
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
            bw.write(  "información original:" + '\t' + original_information + '\n' + "Resultado codificación:" + '\t' + result );
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
