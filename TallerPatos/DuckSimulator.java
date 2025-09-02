import Duck.*;
import FlyBehavior.*;

public class DuckSimulator {
    public static void main(String[] args) {
        System.out.println("--- Mallard Duck ---");
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("--- Rubber Duck ---");
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        System.out.println("--- Decoy Duck ---");
        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();

        System.out.println("--- Cambiando comportamiento --- ");
        decoy.setFlyBehavior(new FlyRocketPowered());
        decoy.performFly();
    }
}
