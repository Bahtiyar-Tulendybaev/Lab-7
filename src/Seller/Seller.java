package Seller;

import Product.Product;

import java.util.Random;

public class Seller {
    private int loadCapacity = 20;
    private int currentWeight ;
    private Product[] laggage;
    private int speed = 3;
    private double money = 500;
    public int getAvailableWeight(){
        return loadCapacity-currentWeight;
    }
    public int getCurrentWeight() {
        return currentWeight;
    }

    public Product[] getLaggage() {
        return laggage;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public Seller(double money){
        this.money = money;
    }

    public void setLaggage(Product[] laggage) {
        this.laggage = laggage;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void anOrdinaryDay() {
        System.out.println("Обычный день.");
    }


    public Seller rainyWeather(Seller seller) {
        System.out.println("Дождь");
        seller.setSpeed(seller.getSpeed() - 2 );
        return seller;
    }


    public Seller smoothRoad(Seller seller) {
        System.out.println("Ровная дорога");
        seller.setSpeed(seller.getSpeed() + 2);
        return seller;
    }


    public Seller theWheelBroke(Seller seller) {
        System.out.println("Сломалось колесо");
        seller.setSpeed(0);
        return seller;
    }


    public Seller river(Seller seller) {
        System.out.println("Река");
        seller.setSpeed(0);
        return seller;
    }


    public Seller iMetLocal(Seller seller) {
        System.out.println("Встретил местного");
        Random rnd = new Random();
        seller.setSpeed(seller.getSpeed()+rnd.nextInt(3)+3);
        return seller;
    }


    public Seller highwaymen(Seller seller) {
        System.out.println("Разбойники большой дороги");

        return seller;
    }


    public void RoadsideInn() {

    }


    public void theProductHasDeteriorated() {

    }
}

