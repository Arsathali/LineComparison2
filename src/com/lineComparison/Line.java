
public class Line {

    private final Point startPoint;
    private final Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength() {
        int xDifference = endPoint.x - startPoint.x;
        int yDifference = endPoint.y - startPoint.y;
        
        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }

}