public class Task0_5 {

    public static void main(String[] args) {
        System.out.println(areaOfTriangle(4,5,3));
    }

    public static double areaOfTriangle(int side1,int side2,int side3){
        double semiPerimeter = 0.5 * (side1 + side2 + side3);
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter -side2) * (semiPerimeter - side3));
        return area;
    }
}
