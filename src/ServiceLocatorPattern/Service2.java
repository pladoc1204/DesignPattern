package ServiceLocatorPattern;

public class Service2 implements Service{
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("EXECUTING SERVICE 2");
    }
}
