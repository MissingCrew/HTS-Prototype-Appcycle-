package me.missingcrew.appcycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Project {

    private String name;
    private String description;
    private HashMap<String, Integer> materials;
    private String anleitung;

    /*
    Name
    Description
    Materialliste
    Anleitung
    */

    public Project(String name, String shortDescription, HashMap<String, Integer> materials, String anleitung) {
        this.name = name;
        this.description = shortDescription;
        this.materials = materials;
        this.anleitung = anleitung;
    }

    public Project(String name, String shortDescription) {
        this.name = name;
        this.description = shortDescription;
        this.materials = new HashMap<>();
        this.anleitung = "";
    }

    public Project() {
        this.materials = new HashMap<>();
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
    public void setMateriallist(HashMap<String,Integer> materials) {
        this.materials = materials;
    }
    public void addMaterial(String material, int count) {
        this.materials.put(material, count);
    }
    public HashMap<String,Integer> getMateriallist() {
        return materials;
    }
    public void setAnleitung(String anleitung) {
        this.anleitung = anleitung;
    }
    public String getAnleitung() {
        return anleitung;
    }
    
}
