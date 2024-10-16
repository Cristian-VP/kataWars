mport java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {

    public static int[] Solve(String word) {
        int upperCaseFind = 0;
        int lowerCaseFind = 0;
        int integerFind = 0;
        int especialCharFind = 0;

        //Lo que se pretende es utilizar los métodos estáticos isDigit(ch), isletter, ect de la clase Character
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Character.html

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);

            if(Character.isDigit(letter)){
                // System.out.println("Entra en int");
                integerFind++;
            }else if(!(Character.isLetter(letter))){
                //System.out.println("Entra en espc");
                especialCharFind++;
            }else if(Character.isUpperCase(letter)){
                //System.out.println("Entra en upper");
                upperCaseFind++;
            }else if(Character.isLowerCase(letter)){
                // System.out.println("Entra en lower");
                lowerCaseFind++;
            }
        }

        int result[] = {upperCaseFind, lowerCaseFind, integerFind, especialCharFind};
        //enjoy coding ;
        return result;
        /**
         * Este bloque de codigo intenté utilizar expresiones regulares con los metodos matches y find. Despues de
         * caerseme el pelo resulta que Matches() no puede recibir char sino una cadena entera
         *
         *
         * String regexEspecialChar = "\\W";
         String regexInteger = "\\d";
         String regexUpperCase = "[A-Z]";
         String regexLowerCase = "[a-z]";


         /Pattern patternEspecialChar = Pattern.compile(regexEspecialChar);
         Pattern patternInteger = Pattern.compile(regexInteger);
         Pattern patternUpperCase = Pattern.compile(regexUpperCase);
         Pattern patternLowerCase = Pattern.compile(regexLowerCase);



         for(int i = 0; i < word.length(); i++){
         char letter = word.charAt(i);
         System.out.println(letter);
         Matcher matcherEspecialChar = patternEspecialChar.matcher(letter);
         Matcher matcherInteger = patternInteger.matcher(word);
         Matcher matcherUpperCase = patternUpperCase.matcher(word);
         Matcher matcherLowerCase = patternLowerCase.matcher(word);

         if(matcherInteger.find()){
         // System.out.println("Entra en int");
         integerFind++;
         }else if(matcherEspecialChar.find()){
         //System.out.println("Entra en espc");
         especialCharFind++;
         }else if(matcherUpperCase.find()){
         //System.out.println("Entra en upper");
         upperCaseFind++;
         }else if(matcherLowerCase.find()){
         // System.out.println("Entra en lower");
         lowerCaseFind++;
         }
         }

         */
    }
}