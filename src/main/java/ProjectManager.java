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

import javax.print.attribute.SetOfIntegerSyntax;


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

    public void displayPercentage(Project p, HashMap<String, Integer> mats)
    {
        //p.getMateriallist();
        //Stein                           75% [#######---]
        HashMap<String, Integer> x = new HashMap<>();
        int max = p.getMateriallist().size()*100;
        double zsm;
        System.out.println("Du hast " + (100/max*zsm) + "% der Materialien");
        for(String all : p.getMateriallist().keySet())
        {
            System.out.print(all + " " + p.getMateriallist().get(all)+ "\t\t\t");
            if(mats.get(all) != null)
            {
                double proz = 100 / p.getMateriallist().get(all) * mats.get(all);
                System.out.print(" [");
                for (int i = 0; i < Math.round(proz); i++) {
                    System.out.print("#");
                }
                int temp = 10-Math.round(proz);
                for (int i = 0; i < temp; i++) {
                    System.out.print("-");
                }
                System.out.println("] " + Math.round((Math.round(proz) *100.0) / 100.0) + "%");
                zsm += Math.round((proz * 100)/100);
            }
            else
            {
                System.out.print(" [----------] 0%\n");
            }
        }
    }
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