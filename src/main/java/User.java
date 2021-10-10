import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<String> materiallist;


    public User(String username, String password, List<String> materiallist) {
        this.username = username;
        this.password = password;
        this.materiallist = materiallist;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.materiallist = new ArrayList<>();
    }

    public void setMateriallist(List<String> materiallist) {
        this.materiallist = materiallist;
    }

    public void addMaterial(String material) {
        this.materiallist.add(material);
    }

    public List<String> getMateriallist() {
        return materiallist;
    }

    public String getUsername() {
        return username;
    }
}
