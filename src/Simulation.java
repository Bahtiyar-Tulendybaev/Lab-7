import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Simulation  implements Events{
    Random rnd = new Random();
    Seller seller = new Seller(rnd.nextInt(100)+101);
    Way way = new Way();

    @Override
    public void anOrdinaryDay() {
        System.out.println("Обычный день.");
    }

    @Override
    public void rainyWeather() {
        System.out.println("Дождь");
        seller.setSpeed(seller.getSpeed() - 2 );

    }

    @Override
    public void smoothRoad() {
        System.out.println("Ровная дорога");
        seller.setSpeed(seller.getSpeed() + 2);

    }

    @Override
    public void theWheelBroke() {
        System.out.println("Сломалось колесо");
        way.setDistance(seller.getSpeed() - 3);
    }

    @Override
    public void river() {
        System.out.println("Река");
        way.setDistance(seller.getSpeed() - 3);
    }

    @Override
    public void iMetLocal() {
        System.out.println("Встретил местного");
        way.setDistance(seller.getSpeed() + 4);
    }

    @Override
    public void Highwaymen() {

    }

    @Override
    public void RoadsideInn() {

    }

    @Override
    public void theProductHasDeteriorated() {

    }
}
