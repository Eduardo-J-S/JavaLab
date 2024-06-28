package gof.singleton;

/**
 * Singleton "preguiçoso",
 * @author Eduardo-J-S
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){}

    public static SingletonLazy getInstancia(){
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
    
}