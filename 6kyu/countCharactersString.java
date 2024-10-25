import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        HashMap<Character, Integer> timesOfLetters = new HashMap<Character, Integer>();

        for(int k=0; k < str.length(); k++){
            if(!timesOfLetters.containsKey(k)){
                for(int i = 0; i < str.length(); i++){
                    char currentChar = str.charAt(i);
                    int accumulator = 0;
                    for(int j= 0 ; j < str.length(); j++){
                        char charToCompare = str.charAt(j);
                        if(currentChar == charToCompare){
                            accumulator++;
                        }
                    }
                    timesOfLetters.put(str.charAt(i), accumulator);
                }
            }
        }
        return timesOfLetters;
    }
}