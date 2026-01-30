
public class LineComparisonMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Line l1 = new Line(new Point(1,2), new Point(4,6));
        Line l2 = new Line(new Point(2,3), new Point(5,7));

        if (l1.equals(l2)) {
            System.out.println("Lines are Equal");
        } else {
            System.out.println("Lines are Not Equal");
        }

        int result = l1.compareTo(l2);

        if (result > 0)
            System.out.println("Line1 is Greater");
        else if (result < 0)
            System.out.println("Line1 is Smaller");
        else
            System.out.println("Lines are Equal");
    }

    
}
