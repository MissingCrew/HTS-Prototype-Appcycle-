import java.util.ArrayList;

public class CommandHandler {
    ArrayList<Command> cmdlist = new ArrayList<Command>();

    public void runCommand(String msg)
    {
        for (int i = 0; i < cmdlist.size(); i++) {
            if(cmdlist.get(i).getName().equals(msg))
            {
                cmdlist.get(i);
            }
        }
    }

}
abstract class Command
{
    private String name;

    public Command(String name)
    {
        this.name = name;
    }

    public void run(){}

    public String getName() { return name; }
}