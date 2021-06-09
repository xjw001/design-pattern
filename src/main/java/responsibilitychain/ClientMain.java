package responsibilitychain;

import java.util.logging.Handler;

public class ClientMain {

    public static void main(String[] args) {
        AbstractHandler handler1 = new ConcreteHanderA();
       AbstractHandler handler2 = new ConcreteHandlerB();
       AbstractHandler handler3 = new ConcreteHanderC();
        handler2.setNextHandler(handler3);
        handler1.setNextHandler(handler2);
        handler1.handle(1);
        handler1.handle(2);
        handler1.handle(3);
        handler1.handle(4);
    }
}
