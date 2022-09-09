import Beepers.Beeper;
import BodyStyles.BodyStyle;
import Engines.Engine;

public class Priora extends Car{
    public Priora(Beeper beeper, Engine engine, BodyStyle bodyStyle) {
        super(beeper, engine, bodyStyle);
    }

    String downShifting() {
        return "Занижена";
    }
}
