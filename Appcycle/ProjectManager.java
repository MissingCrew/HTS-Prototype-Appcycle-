import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;


/**
 * Handles Projects
 * 
 * @author @falscherIdiot
 */
public class ProjectManager
{

    public static void main(String[] args)
    {
    }

    public void createNewProject(Project p)
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

                file = new File("./"+p.getName()+"materiallist.proj");
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