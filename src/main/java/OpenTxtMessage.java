import java.io.File;
import java.util.Scanner;

public class OpenTxtMessage {
    String aux = "";
    private final String file_path_information;
    private static OpenTxtMessage single_instance  = null;

    public  static OpenTxtMessage getInformation(String file_path_information) {

        if (single_instance ==null) {

            single_instance =new OpenTxtMessage(file_path_information);
        }
        return single_instance ;
    }


    private OpenTxtMessage(String file_path_information){
        this.file_path_information =file_path_information;
    }

    public String scannerInformation() {
        try {
            Scanner input = new Scanner(new File(file_path_information));
            while (input.hasNextLine()) {
                aux += input.nextLine();
            }
            input.close();
            return aux;
        } catch (Exception ex) {
            System.out.println("Error:"+ex.getMessage());
        }
        return null;
    }
}