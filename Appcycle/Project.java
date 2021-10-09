package Appcycle;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private String description;
    private List<String> materiallist;
    public String anleitung;

    /*
    Name
    Description
    Materialliste
    Anleitung
    */

    public Project(String name, String shrotDescription, List<String> materiallist, String anleitung) {
        this.name = name;
        this.description = shrotDescription;
        this.materiallist = materiallist;
        this.anleitung = anleitung;
    }

    public Project() {
        this.materiallist = new ArrayList<>();
    }

    







    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
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
    public void setAnleitung(String anleitung) {
        this.anleitung = anleitung;
    }
    public String getAnleitung() {
        return anleitung;
    }
    
}
