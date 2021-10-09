package Appcycle;

import java.util.HashMap;

public class Appcylce {

    private static ProjectManager projectManager;

    
    public static void main(String[] args){
        projectManager = new ProjectManager();

        HashMap<String, Integer> materials = new HashMap<String, Integer>();
        materials.put("Holz", 16);
        materials.put("Blaetter", 25);

        //Project p = new Project("Baum", "Einfach nur ein Baum", materials, "Du bauen Stamm und dann die blaetter darum hehe :D");
        //pManager.addProject(p);
        //pManager.saveAllProjects();
        projectManager.displayAllProjects();
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }
}
