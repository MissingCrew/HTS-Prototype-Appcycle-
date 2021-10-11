package me.missingcrew.appcycle;

import java.util.Scanner;

public class ConsoleHandler {

    public ConsoleHandler() {}

    public void projectLogin() {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Username:");
        animate("Pascal", 300);
        //String username = scanner.nextLine();
        System.out.print("\rPassword: ");
        animate("****************", 250);
        //String password = scanner.nextLine();
        System.out.print("\rLogin? (Y/N): ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        animate("y\n\n", 1000);
        //String login = scanner.nextLine();
        //clearScreen();
        /*switch (login) {
            case "Y": case "y":
                me.missingcrew.appcycle.Appcycle.setUser(new me.missingcrew.appcycle.User(username, password));
                break;
            case "N": case"n":
                projectLogin();
        }*/
        //me.missingcrew.appcycle.Appcycle.setUser(new me.missingcrew.appcycle.User("Pascal", "187Fanboy"));
        /*me.missingcrew.appcycle.Appcycle.getUser().addMaterialWithCount("Stein", 20);
        me.missingcrew.appcycle.Appcycle.getUser().addMaterialWithCount("LED", 4);
        me.missingcrew.appcycle.Appcycle.getUser().addMaterialWithoutCount("Stock");*/
    }

    public void createProject() {
        Scanner scanner = Appcycle.scanner;
        System.out.print("\n----------------------Create me.missingcrew.appcycle.Project------------------------");
        System.out.println("\nName: ");
        String name = scanner.nextLine();
        System.out.println("Description: ");
        String description = scanner.nextLine();

        Project project = new Project(name, description);

        String materialBool = "y";
        System.out.println("------------------------------------------------------------ ");
        do {
            System.out.println("Füge ein Material hinzu: ");
            String material = scanner.next();
            System.out.print("Wie oft? ");
            int count = scanner.nextInt();
            System.out.print("\nMöchtest du ein weiteres Material hinzufügen? (Y/N) ");
            materialBool = scanner.next();
            project.addMaterial(material.toLowerCase(),count);
        } while (!materialBool.equalsIgnoreCase("n"));

        System.out.println("------------------------------------------------------------ ");
        System.out.println("Das me.missingcrew.appcycle.Project '" + name + "' wurde erfolgreich erstellt!");
        Appcycle.getProjectManager().addProject(project);
    }

    private void animate(String msg, int millis)
    {
        try {
            char[] temp = msg.toCharArray();
            for (int i = 0; i < temp.length; i++) {
                System.out.print(temp[i]);
                Thread.sleep(millis);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void addMaterials() {
        Scanner scanner = Appcycle.scanner;
        System.out.print("\nWillst du ein Material hinzufügen? (Y/N):");
        String mats = scanner.nextLine();
        switch (mats) {
            case "Y": case "y":
                System.out.print("Material: ");
                String material = scanner.nextLine();
                Appcycle.getUser().addMaterialWithoutCount(material);
                addMaterials();
                break;
            case "N": case"n":
                break;
            default:
                addMaterials();
                break;
        }
    }

    public void showCommands() {
        System.out.println("-------------------Commands-------------------");
        System.out.println("login");
        System.out.println("createproject");
        System.out.println("addmaterials");
        System.out.println("listmaterials");
        System.out.println("listprojects");
        System.out.println("showpercentages");
        System.out.println("exit\n");
    }

    public void projectMaterials() {
        System.out.println("\n-----------------------Materials-------------------------");
        for (String all : Appcycle.getUser().getMaterials().keySet()) {
            System.out.println(all + " x" + Appcycle.getUser().getMaterials().get(all));
        }
        //clearScreen();
    }

    public void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
        }
    }


}
