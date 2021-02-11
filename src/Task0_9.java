import java.util.ArrayList;

public class Task0_9 {

    public static void main(String[] args) {
        numberOfVowels("Orifha");
    }
    public static void numberOfVowels(String word){

        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        ArrayList<Character> vowelsArray = new ArrayList<>();

        for (char vowel : vowels){
            vowelsArray.add(vowel);
        }
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if (vowelsArray.contains(letter)){
                System.out.println(letter);
            }
        }

    }
}
