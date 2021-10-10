import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Appcycle {
    public static Appcycle main;
    private static ProjectManager projectManager;
    private static ConsoleHandler consoleHandler;
    private static User user;


    public static void main(String[] args){
        projectManager = new ProjectManager();
        consoleHandler = new ConsoleHandler();

        /*HashMap<String, Integer> materials = new HashMap<String, Integer>();
        materials.put("Holz", 16);
        materials.put("Blaetter", 25);

        Project p = new Project("Baum", "Einfach nur ein Baum", materials, "Du bauen Stamm und dann die blaetter darum hehe :D");
        projectManager.addProject(p);
        projectManager.displayAllProjects();
        try {
            JsonHandler.saveAllProjects();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        JsonHandler.loadEverything();
        //System.out.print("\r");
        //System.out.println("deine mom");

        consoleHandler.projectLogin();
        consoleHandler.inputMaterials();
        try {
            JsonHandler.saveUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
        consoleHandler.projectMaterials();

        /*try {
            System.out.print("Hallo ich bin der Peter");
            Thread.sleep(1500);
            for (int i = 0; i < 1000; i++) {
                System.out.println(" ");
            }
            System.out.print("\nIch mag Zuege");
            for (int i = 0; i < 12; i++) {
                System.out.println(" ");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }*/
    }

    public static ProjectManager getProjectManager() {
        return projectManager;
    }

    public static void setUser(User user) {
        Appcycle.user = user;
    }
    public static User getUser() {
        return user;
    }
}
