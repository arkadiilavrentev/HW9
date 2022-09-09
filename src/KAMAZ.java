import Beepers.Beeper;
import BodyStyles.BodyStyle;
import Engines.Engine;

public class KAMAZ extends Car{
    public KAMAZ(Beeper beeper, Engine engine, BodyStyle bodyStyle) {
        super(beeper, engine, bodyStyle);
    }
    String carryingCapacity() {
        return "Максимальный груз - 13 000 кг";
    }
}
