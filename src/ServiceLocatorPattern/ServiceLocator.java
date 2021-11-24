package ServiceLocatorPattern;

public class ServiceLocator {
    private static Cache cache;
    //为什么这里要用static？
    static{
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            System.out.println("缓存");
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
