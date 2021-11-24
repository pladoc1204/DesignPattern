package ServiceLocatorPattern;

public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("搜索并创建新的服务1对象");
            return new Service1();
        }else if(jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("搜索并创建新的服务2对象");
            return new Service2();
        }
        return null;
    }
}
