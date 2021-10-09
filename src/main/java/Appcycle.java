import java.io.IOException;
import java.util.HashMap;

public class Appcycle {
    public static Appcycle main;
    private static ProjectManager projectManager;


    public static void main(String[] args){
        projectManager = new ProjectManager();

        HashMap<String, Integer> materials = new HashMap<String, Integer>();
        materials.put("Holz", 16);
        materials.put("Blaetter", 25);

        /*Project p = new Project("Baum", "Einfach nur ein Baum", materials, "Du bauen Stamm und dann die blaetter darum hehe :D");
        projectManager.addProject(p);
        projectManager.displayAllProjects();
        try {
            JsonHandler.saveAllProjects();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            JsonHandler.loadAllProjects();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ProjectManager getProjectManager() {
        return projectManager;
    }
}
