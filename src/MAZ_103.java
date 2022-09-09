import Beepers.Beeper;
import BodyStyles.BodyStyle;
import Engines.Engine;

public class MAZ_103 extends Car {
    public MAZ_103(Beeper beeper, Engine engine, BodyStyle bodyStyle) {
        super(beeper, engine, bodyStyle);
    }

    String nominalPeopleCapacity() {
        return "Вместимость - 90 человек";
    }
}
