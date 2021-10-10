import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        int max = 0;
        double zsm = 0;
        for(String all : p.getMateriallist().keySet())
        {
            System.out.print(all + " x" + p.getMateriallist().get(all)+ "\t\t\t");
            if (Appcycle.getUser().isMaterial(all)) {
                max += p.getMateriallist().get(all);
                zsm += mats.get(all);
                if(mats.get(all) != null)
                {
                    double proz = (double) 100 / p.getMateriallist().get(all) * mats.get(all);
                    //System.out.println(proz);
                    if (proz >= 100) {
                        System.out.print("[##########] 100%\n");
                    }
                    else {
                        System.out.print(" [");
                        for (int i = 0; i < proz /10; i++) {
                            System.out.print("#");
                        }
                        int temp = 10- (int) proz /10 ;
                        for (int i = 0; i < temp; i++) {
                            System.out.print("-");
                        }
                        System.out.println("] " + ((proz *100.0) / 100.0) + "%");
                        //zsm += Math.round((proz * 100)/100);
                    }
                }
            }
            else
            {
                System.out.print(" [----------] 0%\n");
            }
        }
        System.out.println("Du hast " +  Math.round(100.0/max*zsm) + "% der Materialien");
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