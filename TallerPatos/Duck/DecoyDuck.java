package Duck;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Mute;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck!");
    }
}


