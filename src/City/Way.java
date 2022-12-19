package City;

public class Way {
    private Towns startPoint;
    private Towns endPoint;
    private int distance;

    public Towns getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Towns startPoint) {
        this.startPoint = startPoint;
    }

    public Towns getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Towns endPoint) {
        this.endPoint = endPoint;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
