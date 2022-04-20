import java.util.ArrayList;
import java.util.List;

public class OrganizeInformation {
    private final String list_txt_information;

    public OrganizeInformation(String list_txt_information) {
        this.list_txt_information = list_txt_information;
    }
    public List<String> splitInformation() {
        List<String> list_information_organized = new ArrayList<>();
        if (list_txt_information.contains("-")) {
            String[] split_list = list_txt_information.split("-");
            list_information_organized.add(split_list[0]);
            list_information_organized.add(split_list[1]);
        } else
        {
            System.out.println("por favor verifique el archivo txt");
        };
        return list_information_organized;
    }
}