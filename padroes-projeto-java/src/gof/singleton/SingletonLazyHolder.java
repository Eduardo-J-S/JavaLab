package gof.singleton;

/**
 * Singleton "Lazy Holder",
 * @author Eduardo-J-S
 */
public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){}

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
    
}