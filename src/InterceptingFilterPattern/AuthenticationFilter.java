package InterceptingFilterPattern;

public class AuthenticationFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("Doing authentication:"+request);
    }
}
