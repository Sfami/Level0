public class Task0_8 {

    public static void main(String[] args) {
	// write your code here
        System.out.println(convertToHours(61));

    }
    public static String convertToHours(double number){
        String hoursString = "";

        if (Math.floor(number / 60) > 1){
            hoursString += Math.floor(number / 60) + " hours";
        }

        if (Math.floor(number / 60) == 1){
            hoursString += Math.floor(number / 60) + " hour";
        }

        if (Math.floor(number / 60) == 0){
            hoursString += Math.floor(number / 60) + " hours";
        }

        if (number % 60 > 1){
            hoursString += ", " + number % 60 + " minutes ";
        }

        if (number % 60 == 1){
            hoursString += ", " + number % 60 + " minute ";
        }

        if (number % 60 == 0){
            hoursString += ", " + number % 60 + " minutes ";
        }


        return hoursString;

    }
}
