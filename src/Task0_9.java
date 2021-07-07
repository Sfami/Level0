import java.util.ArrayList;
import java.util.Arrays;

public class Task0_9 {

    public static void main(String[] args) {
        numberOfVowels("Orifha");
    }
    public static void numberOfVowels(String word){
        ArrayList<String> vowels = new ArrayList<>(Arrays.asList(new String[]{"a", "e", "i", "o", "u"}));
        ArrayList<String> vowelsAlreadyListed = new ArrayList<>();
        ArrayList<String> finalListedVowels = new ArrayList<>();
        String stringOfVowels = "Vowels: ";
        for (int i = 0; i < word.length(); i++){
            String letter = "" + word.charAt(i);
            letter = letter.toLowerCase();
            if (vowels.contains(letter)){
                if (!vowelsAlreadyListed.contains(letter)){
                    finalListedVowels.add(letter);
                }
            }
        }
        for (int i = 0; i < finalListedVowels.size(); i++) {
            if (i == 0) stringOfVowels += finalListedVowels.get(i);
            else stringOfVowels += ", " + finalListedVowels.get(i);
        }
        System.out.println(stringOfVowels);

    }
}
