package Product;

import State.Quality;

public class Product {
    private int weight;
    private String name;
    private int cost;
    private Quality quality = Quality.NORMAL;

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Quality getQuality() {
        return quality;
    }

    public double getPrice() {
        return price;
    }

    public int getCost() {
        return cost;
    }

    private double price = cost*getCoeff(quality);
    public Product(int weight, String name, int cost){
        this.weight = weight;
        this.name = name;
        this.cost = cost;
    }

    public double getCoeff(Quality quality){
        double coef = 0;
        switch (quality){
            case NORMAL: coef = 1.2;
            case LittleDamage: coef = 0.95;
            case HalfDamage: coef = 0.55;
            case MostDamage: coef = 0.25;
            case FullDamage: coef = 0.1;
        }
        return coef;
    }


}
