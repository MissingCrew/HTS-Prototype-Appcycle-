import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {
    private String username;
    private String password;
    private HashMap<String, Integer> materials;


    public User(String username, String password, HashMap<String, Integer> materials) {
        this.username = username;
        this.password = password;
        this.materials = materials;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.materials = new HashMap<>();
    }

    public void setMaterials(HashMap<String, Integer> materials) {
        this.materials = materials;
    }

    public void addMaterialWithCount(String material, int count) {
        this.materials.put(material.toLowerCase(), count);
    }

    public boolean isMaterial(String material) {
        return materials.containsKey(material);
    }

    public void addMaterialWithoutCount(String material) {
        if (!isMaterial(material.toLowerCase())) {
            materials.put(material.toLowerCase(), 1);
            return;
        }
        int count = materials.get(material.toLowerCase());
        this.materials.put(material.toLowerCase(), count+1);
        return;
    }

    public HashMap<String, Integer> getMaterials() {
        return materials;
    }

    public String getUsername() {
        return username;
    }
}
