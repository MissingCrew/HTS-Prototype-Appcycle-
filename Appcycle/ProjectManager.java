import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


/**
 * Handles Projects
 * 
 * @author @falscherIdiot
 */
public class ProjectManager
{

    private List<Project> projects;

    public ProjectManager() {
        
    }

    public static void main(String[] args)
    {
        ProjectManager p = new ProjectManager();
        HashMap<String, Integer> materials = new HashMap<String, Integer>();
        materials.put("Holz", 16);
        materials.put("Blaetter", 25);
        p.saveProject(new Project("Baum", "Einfach nur ein Baum", materials, "Du bauen Stamm und dann die blaetter darum hehe :D"));
    }

    public void saveProject(Project p)
    {
        File dir = new File("./" + p.getName());
        if(dir.mkdir())
        {
            try {
                                       //  ./{PROJECTNAME}/info.proj
                File file = new File("./"+p.getName()+"/info.proj");
                file.createNewFile();
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write(p.getName());
                bw.newLine();
                bw.write(p.getDescription());
                bw.newLine();
                bw.close();

                file = new File("./"+p.getName()+"/anleitung.proj");
                file.createNewFile();

                bw = new BufferedWriter(new FileWriter(file));
                bw.write(p.getAnleitung());
                bw.newLine();
                bw.close();

                file = new File("./"+p.getName()+"/materiallist.proj");
                file.createNewFile();

                bw = new BufferedWriter(new FileWriter(file));
                bw.write(p.getMateriallist().toString());
                bw.newLine();
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else
        {
            System.out.println("Project already exists!");
            System.exit(-1);
        }       
    }

    public void displayAllProjects() 
    {
        // TODO:: Display All Projects
    }

}