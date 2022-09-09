import Beepers.Beeper;
import Engines.Engine;
import BodyStyles.BodyStyle;

public class Lambo extends Car {
    public Lambo(Beeper beeper, Engine engine, BodyStyle bodyStyle) {
        super(beeper, engine, bodyStyle);
    }

    String Price(){
        return "99999999999999999 р.";
    }
}
