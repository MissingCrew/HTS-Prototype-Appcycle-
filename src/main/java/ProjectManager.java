import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
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
        projects = new ArrayList<>();
    }

    public void addProject(Project p) {
        for(Project all : projects) {
            if(all.getName().equalsIgnoreCase(p.getName())) {
                System.out.println("Project under this name already exists!");
                return;
            }
        }
        projects.add(p);
    }

    /*public void saveProject(Project p)
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
            return;
        }       
    }*/

    public void displayAllProjects() 
    {
        for(Project all : projects) {
            System.out.println(all.getName() + " : " + all.getDescription());
        }
    }
    

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}