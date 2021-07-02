import java.util.*;

public class Task0_10 {

    public static void main(String[] args) {
        commonLetters("house", "computers");
    }

    public static void commonLetters(String word1, String word2){
        String longestWord = word1;
        String shortestWord = word2;
        int iterations = word1.length();
        if (word2.length() > iterations) {
            iterations = word2.length();
            longestWord = word2;
            shortestWord = word1;
        }
        ArrayList<String> longestWordLetters = new ArrayList<>();
        for (int i = 0; i < longestWord.length(); i++) {
            longestWordLetters.add("" + longestWord.charAt(i));
        }
        ArrayList<String> commonLetters = new ArrayList<>();
        for (int i = 0; i < shortestWord.length(); i++){
            String letter = "" + shortestWord.charAt(i);
            letter = letter.toLowerCase();
            if (longestWordLetters.contains(letter)){
                if (!commonLetters.contains(letter)){
                    commonLetters.add(letter);
                }
            }
        }
        String stringOfCommonLetters = "";
        for (int i = 0; i < commonLetters.size(); i++) {
            if (i == 0) stringOfCommonLetters += commonLetters.get(i);
            else stringOfCommonLetters += ", " + commonLetters.get(i);
        }
        System.out.println(stringOfCommonLetters);
    }
}
