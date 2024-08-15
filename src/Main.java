import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Main {
    public static void main(String[] args) {

        // Testar Singleton
        testSingletons();

        // Testar Strategy
        testStrategy();

        // Testar Facade
        testFacade();
    }

    private static void testSingletons() {
        System.out.println("Testing Singleton Pattern:");

        // Singleton Lazy
        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        System.out.println("SingletonLazy instance 1: " + lazy1);
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println("SingletonLazy instance 2: " + lazy2);

        // Singleton Eager
        SingletonEager eager1 = SingletonEager.getInstancia();
        System.out.println("SingletonEager instance 1: " + eager1);
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println("SingletonEager instance 2: " + eager2);

        // Singleton LazyHolder
        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstancia();
        System.out.println("SingletonLazyHolder instance 1: " + lazyHolder1);
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println("SingletonLazyHolder instance 2: " + lazyHolder2);

        System.out.println(); // Line break for better readability
    }

    private static void testStrategy() {
        System.out.println("Testing Strategy Pattern:");

        // Criar comportamentos
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        // Criar robo e aplicar comportamentos
        Robo robo = new Robo();

        System.out.println("Robo com comportamento normal:");
        robo.setComportamento(normal);
        robo.mover();


        System.out.println("Robo com comportamento defensivo:");
        robo.setComportamento(defensivo);
        robo.mover();

        System.out.println("Robo com comportamento agressivo:");
        robo.setComportamento(agressivo);
        robo.mover();


        System.out.println(); // Line break for better readability
    }

    private static void testFacade() {
        System.out.println("Testing Facade Pattern:");

        // Criar e usar fachada
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");

        System.out.println(); // Line break for better readability
    }
}
