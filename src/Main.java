import City.Towns;
import City.Way;
import Product.Product;
import Seller.Seller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Seller seller = new Seller(rnd.nextInt(100)+71);
        seller = buy(seller);
        Way way = new Way();
        way = way(way);
        way = go(way, seller);

    }

    public static Product addProducts(String name, int weight, int cost){
        Product product = new Product(weight, name, cost);
        return product;
    }

    public static Seller buy(Seller seller) {
        Random rnd = new Random();
        Product[] products = {
                addProducts("Meal", 6, 50),
                addProducts("Dried Fruits", 5, 40),
                addProducts("Corn", 4, 20),
                addProducts("Flour", 3, 30),
                addProducts("Cloth", 3, 25),
                addProducts("Dye", 2, 35)
        };

        List<Product>laggage=new ArrayList<>();
        System.out.println("Прибыль: "+seller.getMoney());
        System.out.println("Доступное пространство: "+seller.getAvailableWeight());
        while (true){
            int i = rnd.nextInt(6);
            if (seller.getMoney()<20 || seller.getAvailableWeight()<2){
                break;
            }
            if(seller.getMoney()>=products[i].getCost() && seller.getAvailableWeight()>=products[i].getWeight()) {
                laggage.add(products[i]);
                seller.setMoney(seller.getMoney() - products[i].getCost());
                seller.setCurrentWeight(seller.getCurrentWeight() + products[i].getWeight());
            }
        }
        for (int i = 0; i < laggage.size(); i++) {
            System.out.println(laggage.get(i).getName()+"   "+laggage.get(i).getCost());

        }
        System.out.println("Прибыль: "+seller.getMoney());
        System.out.println("Доступное пространство: "+seller.getAvailableWeight());

        return seller;
    }
    public static Way way(Way way){
        Random rnd = new Random();
        way.setStartPoint(logistic(rnd.nextInt(7)+1));
        way.setEndPoint(way.getStartPoint());
        while (way.getEndPoint().equals(way.getStartPoint())){
           way.setEndPoint(logistic(rnd.nextInt(7) + 1));
           System.out.println("\n\n-----------\n\n"+"начало...");
        }


        way.setDistance(rnd.nextInt(50)+51);
        System.out.println("Начальная точка: "+way.getStartPoint());
        System.out.println("Конечная цель: "+way.getEndPoint());
        System.out.println("Дистанция: "+way.getDistance() + " лиги");
        return way;
    }
    public static Towns logistic(int i){
        Towns town = Towns.BISHKEK;
        switch (i){
            case 1: town = Towns.BALYKCHY;
            break;
            case 2: town = Towns.BATKEN;
            break;
            case 3: town = Towns.BISHKEK;
            break;
            case 4: town = Towns.KARAKOL;
            break;
            case 5: town = Towns.NARYN;
            break;
            case 6: town = Towns.OSH;
            break;
            case 7: town = Towns.TALAS;
            break;
        }
        return town;
    }

    public static Way go(Way way, Seller seller){
        int currentDay = 1;
        while (way.getDistance()>0){
            seller = event(seller);
            way.setDistance(Math.max(way.getDistance()-seller.getSpeed(), 0));
            System.out.printf("День %d, осталось %d лиг...\n",currentDay, way.getDistance());
            seller.setSpeed(3);
            currentDay++;
        }
        System.out.println("Прибыл к точке назначения!");
        return way;
    }
    public static Seller event(Seller seller)
            {
     Random rnd = new Random();
     int e = rnd.nextInt(3)+1;
     switch (e){
         case 1 : seller.anOrdinaryDay();
         break;
         case 2 : seller.rainyWeather(seller);
         break;
         case 3: seller.smoothRoad(seller);
     }
     return seller;
    }

}