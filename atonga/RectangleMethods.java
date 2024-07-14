 // This program helps you to calculate the perimeter and area of a rectangle
 public class RectangleMethods {
    double length, width, area, perimeter;

    // Creating a method to compute area
    double computeArea(double length, double width) {
        area = length * width;
        return area;
    }

    // Creating a method to compute perimeter
    double computePerimeter(double length, double width) {
        perimeter = 2 * (length + width);
        return perimeter;
    }

    public static void main(String[] args) {
        RectangleMethods recobj = new RectangleMethods();

        // Calling the methods using object
        double returnedArea = recobj.computeArea(4, 7);
        double returnedPerimeter = recobj.computePerimeter(5, 5);

        System.out.println("Area is " + returnedArea);
        System.out.println("Perimeter is " + returnedPerimeter);
    }
}
