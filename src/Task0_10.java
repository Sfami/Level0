import java.util.ArrayList;

public class Task0_10 {

    public static void main(String[] args) {
	// write your code here
        commonLetters("house", "computers");
    }

    public static void commonLetters(String string1, String string2){

        ArrayList<Character> longestStringLetters = new ArrayList<>();
        String longestString = new String();
        String shortestString = new String();
        if (string1.length() > string2.length()){
            longestString = string1;
            shortestString = string2;
        }
        else {
            longestString = string2;
            shortestString = string1;
        }
        for (int i = 0; i < longestString.length(); i++){
            char letter = longestString.charAt(i);
            longestStringLetters.add(letter);
        }

        for (int i = 0; i < shortestString.length(); i++){
            char letter = shortestString.charAt(i);
            if (longestStringLetters.contains(letter)){
                System.out.println(letter);
            }
        }
    }
}
