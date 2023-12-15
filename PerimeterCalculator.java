public class PerimeterCalculator {
    public static void main(String[] args) {
        // Creating an object of the Rectangle class
        Rectangle myRectangle = new Rectangle();

        // Using setter methods to initialize instance variables
        myRectangle.setLength(5);
        myRectangle.setBreadth(10);

        // Invoking the calculatePerimeter method
        myRectangle.calculatePerimeter();
    }
}