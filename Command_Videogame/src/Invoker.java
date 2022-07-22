import java.util.ArrayList;
import java.util.List;

public class Invoker implements Command{

    //lista de commands para chamar em lote

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        synchronized (this) {
           this.commands.add(command);
        }
    }

    @Override
    public void execute() {
        synchronized (this) {
            for (Command command : commands) {
                command.execute();
            }
            commands.clear();
        }
    }
}
