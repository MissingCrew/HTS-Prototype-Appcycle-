import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonHandler {

    public static void saveAllProjects() throws IOException {

        /*for (Project all : Appcycle.getProjectManager().getProjects()) {
            File file = new File("./projects/" + all.getName() + ".txt");
            //file.createNewFile();
            JSONObject obj = new JSONObject();
            JSONArray materials = new JSONArray();

            obj.put("Name", all.getName());
            obj.put("Descrption", all.getDescription());
            obj.put("Anleitung", all.getAnleitung());
            for (String mats : all.getMateriallist().keySet()) {
                materials.add(mats + " : " + all.getMateriallist().get(mats));
            }
            obj.put("Materials", materials);

            try {

                // Constructs a FileWriter given a fileWriter name, using the platform's default charset
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(obj.toJSONString());
                System.out.println(obj.toJSONString());
                fileWriter.close();
                System.out.println("Successfully Copied JSON Object to File..." + all.getName());

            } catch (IOException e) {
                e.printStackTrace();

            }
        }*/


        Gson gson = new Gson();
        FileWriter fileWriter = new FileWriter("Projects.json");
        Project[] projectArray = Appcycle.getProjectManager().getProjects().toArray(new Project[Appcycle.getProjectManager().getProjects().size()]);
        gson.toJson(projectArray, fileWriter);
        fileWriter.close();
    }

    public static void loadAllProjects() throws IOException {
        Gson gson = new Gson();
        FileReader fileReader = new FileReader("Projects.json");
        BufferedReader reader = new BufferedReader(fileReader);
        Type listOfMyClassObject = new TypeToken<ArrayList<Project>>() {}.getType();
        List<Project> projectList = gson.fromJson(reader.readLine(),listOfMyClassObject);
        Appcycle.getProjectManager().setProjects(projectList);
        reader.close();

        //Appcycle.getProjectManager().displayAllProjects();
    }
}
