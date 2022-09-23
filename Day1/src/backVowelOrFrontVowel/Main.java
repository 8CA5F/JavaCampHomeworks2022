package backVowelOrFrontVowel;

public class Main {
    public static void main(String[] args) {
        //check if the character is it front vowel or back vowel.
        String backVowels = "aıou";
        String frontVowels = "eiöü";
        String character = "i", result;

        if(backVowels.contains(character)) result = "Character is a back vowel.";
        else if (frontVowels.contains(character)) result = "Character is a front vowel.";
        else result = "Something went wrong!";

        System.out.println(result);
    }
}
