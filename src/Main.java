import Beepers.Brum;
import Beepers.Horn;
import Beepers.Kukaracha;
import Beepers.MagicSound;
import BodyStyles.Bus;
import BodyStyles.Coupe;
import BodyStyles.Sedan;
import BodyStyles.Truck;
import Engines.EngineV12;
import Engines.EngineV6;
import Engines.EngineV8;
import Engines.Euro5;

public class Main {
    public static void main(String[] args) {
        Brum brum = new Brum();
        EngineV12 engineV12 = new EngineV12();
        Coupe coupe = new Coupe();

        MagicSound magicSound = new MagicSound();
        EngineV6 engineV6 = new EngineV6();
        Sedan sedan = new Sedan();

        Horn horn = new Horn();
        EngineV8 engineV8 = new EngineV8();
        Truck truck = new Truck();

        Kukaracha kukaracha = new Kukaracha();
        Euro5 euro5 = new Euro5();
        Bus bus = new Bus();

        Lambo lambo = new Lambo(brum, engineV12, coupe);

        Priora priora = new Priora(magicSound, engineV6, sedan);

        KAMAZ kamaz = new KAMAZ(horn, engineV8, truck);

        MAZ_103 maz103 = new MAZ_103(kukaracha, euro5, bus);

        System.out.println("Lamborgini:");
        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(lambo.bodyStyle.body());
        System.out.println(lambo.Price());
        System.out.println();

        System.out.println("Priora:");
        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.bodyStyle.body());
        System.out.println(priora.downShifting());
        System.out.println();

        System.out.println("KAMAZ:");
        System.out.println(kamaz.beeper.makeSound());
        System.out.println(kamaz.engine.getSpeed());
        System.out.println(kamaz.bodyStyle.body());
        System.out.println(kamaz.carryingCapacity());
        System.out.println();

        System.out.println("MAZ-103:");
        System.out.println(maz103.beeper.makeSound());
        System.out.println(maz103.engine.getSpeed());
        System.out.println(maz103.bodyStyle.body());
        System.out.println(maz103.nominalPeopleCapacity());
        System.out.println();
    }
}