import SingletonClass.Singleton;



public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton("kartik");
        Singleton singleton2 = Singleton.getSingleton("Gourav");

        System.out.println(singleton1.getName());
        System.out.println(singleton2.getName());
    }

}