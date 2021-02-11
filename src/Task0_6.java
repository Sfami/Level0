public class Task0_6 {

    public static void main(String[] args) {
	// write your code here
        System.out.println(maximum(1,2,3));
    }
    public static double maximum(double a, double b, double c){
        double maximum = 0;
        if (a > b && a > c){
            maximum = a;
        }
        else if (b > a && b > c){
            maximum = b;
        }
        else if (c > a && c > b){
            maximum = c;
        }
        return maximum;
    }
}
