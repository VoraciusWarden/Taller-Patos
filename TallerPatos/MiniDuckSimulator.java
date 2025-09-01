import Duck.*;
import FlyBehavior.*;
import QuackBehavior.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("\n--- Rubber Duck ---");
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        System.out.println("\n--- Decoy Duck ---");
        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();

        System.out.println("\n--- Cambiando comportamiento dinámicamente ---");
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }
}
