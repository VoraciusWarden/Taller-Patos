package Duck;

import FlyBehavior.FlyNoWay;
import QuackBehavior.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("-> I'm a decoy duck!");
    }
}


