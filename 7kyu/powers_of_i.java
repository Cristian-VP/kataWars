public class Kata {

    public static String pofi(int n) {
        //Las potencias de i se reptien indefinidamente en valores de 4 i⁰,i¹,i²,i³,i⁴
        //por lo que el si queremos saber la prepresentacion de la unidad imaginaria de cualquier numero i^n,
        //su exponente será el resto de la división del entero por 4.
        String iPower="0";

        if(n%4 == 0){
            iPower = "1";
        }else if(n%4 == 1){
            iPower = "i";
        }else if(n%4 == 2){
            iPower = "-1";
        }else if(n%4 == 3){
            iPower = "-i";
        }

        return iPower;
    }

}