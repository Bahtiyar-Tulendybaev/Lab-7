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
}

