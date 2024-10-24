import java.util.Arrays;

public class MexicanWave {

    public static String[] wave(String str) {
        // Your code her
        String[] wavesLetters = new String[str.length()];
        int k = 0;

        for(int i = 0; i < str.length(); i++){
            StringBuilder charWaves = new StringBuilder();
            String rebootChar = "";

            System.out.println(i);
            for(int j = 0; j < str.length();j++){
                char currentIndex = str.charAt(j);
                if(j == i){
                    currentIndex = Character.toUpperCase(str.charAt(j));
                }
                charWaves.append(currentIndex);
            }
            // Solo añadimos al array si el carácter en la posición 'i' no es un espacio
            if (!Character.isWhitespace(str.charAt(i))) {

                wavesLetters[k] = charWaves.toString();
                k++;  // Incrementamos k solo cuando agregamos un valor al array
            }

            charWaves = new StringBuilder(rebootChar);
        }
        //Voy crear una copia del array solo con los vlaores buenos
        wavesLetters = Arrays.copyOf(wavesLetters, k);

        return wavesLetters;
    }
}