package me.missingcrew.appcycle;

import java.util.Scanner;

public class Appcycle {
    public static Appcycle main;
    private static ProjectManager projectManager;
    private static ConsoleHandler consoleHandler;
    private static User user;
    public static Scanner scanner;


    public static void main(String[] args){
        projectManager = new ProjectManager();
        consoleHandler = new ConsoleHandler();
        scanner = new Scanner(System.in);


        JsonHandler.loadEverything();



        /*HashMap<String, Integer> materials = new HashMap<String, Integer>();
        materials.put("Holz", 16);
        materials.put("Blaetter", 25);

        me.missingcrew.appcycle.Project p = new me.missingcrew.appcycle.Project("Baum", "Einfach nur ein Baum", materials, "Du bauen Stamm und dann die blaetter darum hehe :D");
        projectManager.addProject(p);
        projectManager.displayAllProjects();
        try {
            me.missingcrew.appcycle.JsonHandler.saveAllProjects();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //System.out.print("\r");
        //System.out.println("deine mom");
        //consoleHandler.createProject();

/*        if(args.equals("login"))
        {
            consoleHandler.projectLogin();
        }
        else if(args.equals("createproject"))
        {
            consoleHandler.projectLogin();
        }
        else if(args.equals("inputmaterials"))
        {
            consoleHandler.projectLogin();
        }
        else if(args.equals("listmaterials"))
        {
            consoleHandler.projectLogin();
        }*/
        while (true) {
            String cmd = scanner.nextLine();
            switch (cmd.toLowerCase()) {
                case "login":
                    consoleHandler.projectLogin();
                    break;
                case "createproject":
                    consoleHandler.createProject();
                    break;
                case "addmaterials":
                    consoleHandler.addMaterials();
                    break;
                case "listmaterials":
                    consoleHandler.projectMaterials();
                    break;
                case "listprojects":
                    getProjectManager().displayAllProjects();
                    break;
                case "showpercentages":
                    for (Project all : getProjectManager().getProjects()) {
                        System.out.println("------------------------------------------------------");
                        System.out.println("me.missingcrew.appcycle.Project Name: " + all.getName());
                        getProjectManager().displayPercentage(all, getUser().getMaterials());
                        System.out.println("\nAnleitung:" + all.getAnleitung());
                    }
                    break;
                case "help":
                    consoleHandler.showCommands();
                    break;
                case "exit":
                    JsonHandler.saveEverything();
                    scanner.close();
                    System.exit(1);
                    break;
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
        }

        //consoleHandler.projectMaterials();
        //getProjectManager().displayAllProjects();
        //getProjectManager().displayPercentage(getProjectManager().getProjects().get(0), getUser().getMaterials());

        //consoleHandler.projectLogin();
        //consoleHandler.inputMaterials();
        //consoleHandler.projectMaterials();

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
        //me.missingcrew.appcycle.JsonHandler.saveEverything();
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
