import java.util.*;
public class Scramblies {
    public static HashMap<Character, Integer> buildMap (char[] letters){
        HashMap <Character, Integer> map = new HashMap<>(letters.length);
        for(char letter : letters){
            map.put(letter, map.getOrDefault(letter, 0)+1);
        }
        return map;
    }

    public static int assignTotal(HashMap<Character, Integer> map){
        int total = 0;
        for(int value : map.values()){
            total += value;
        }
        return total;
    }

    public static boolean scramble(String str1, String str2) {
        char[] letters = str2.toCharArray();
        char[] lettersPool = str1.toCharArray();
        HashMap<Character, Integer> lettersToMatch = buildMap(letters);
        int totalToMatch = assignTotal(lettersToMatch);
        int restToMatch = 0;
        int sizePoolLetters = lettersPool.length;

        if(str1.length() < totalToMatch) return false;

        for(int i = 0; i < sizePoolLetters; i++){
            if(lettersToMatch.containsKey(lettersPool[i])){
                if(lettersToMatch.get(lettersPool[i]) > 0 ){
                    lettersToMatch.replace(lettersPool[i], lettersToMatch.get(lettersPool[i])-1);
                    totalToMatch --;
                }
            }
            if(totalToMatch == 0) return true;
        }
        return false;
    }
}