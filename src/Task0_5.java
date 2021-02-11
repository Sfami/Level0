public class Task0_5 {

    public static void main(String[] args) {
	    System.out.println(areaOfTriangle(4,5,3));
    }

    public static double areaOfTriangle(int side1,int side2,int side3){
        double s = 0.5 * (side1 + side2 + side3);//finding semi-perimeter of the triangle
        double area = Math.sqrt(s * (s - side1) * (s -side2) * (s - side3));
        return area;
    }
}
