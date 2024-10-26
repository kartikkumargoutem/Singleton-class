package SingletonClass;

public class Singleton {

    private static Singleton singleton = null;
    private static String name = null;

    private Singleton(){}

    public static Singleton getSingleton(String x){
        if(singleton == null){
            name = x;
            singleton = new Singleton();
        }
        return singleton;

    }

    public String getName(){
        return name;
    }

}
