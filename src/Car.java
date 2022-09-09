import Beepers.Beeper;
import BodyStyles.BodyStyle;
import Engines.Engine;

public abstract class Car {

    Beeper beeper;
    Engine engine;

    BodyStyle bodyStyle;
    public Car (Beeper beeper, Engine engine, BodyStyle bodyStyle){
        this.beeper = beeper;
        this.engine = engine;
        this.bodyStyle = bodyStyle;
    }
}
