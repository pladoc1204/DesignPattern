package InterceptingFilterPattern;

public class DebugFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("doing Log: "+request);
    }
}
