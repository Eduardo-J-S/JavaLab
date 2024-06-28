package gof.singleton;

/**
 * Singleton "apressado",
 * @author Eduardo-J-S
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstancia(){
        return instancia;
    }
    
}