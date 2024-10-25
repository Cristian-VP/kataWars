import java.util.ArrayList;
public class Minimum{

    public static int minValue(int[] values){
        ArrayList<Integer> sinRepeticiones = new ArrayList <>();
        // int accum= 0;
        int currentIndx;
        int indxToCompare;
        StringBuilder stringMinNumber = new StringBuilder();

        for(int i=0; i < values.length; i++){
            currentIndx= values[i];
            if(!sinRepeticiones.contains(values[i])){
                sinRepeticiones.add(currentIndx);
            }
        }

        for(int j = 0; j<sinRepeticiones.size()-1;j++){
            for(int k = j+1; k<sinRepeticiones.size();k++){
                if(sinRepeticiones.get(k)<sinRepeticiones.get(j)){
                    int minNumberTemporal = sinRepeticiones.get(j);
                    sinRepeticiones.set(j,sinRepeticiones.get(k));
                    sinRepeticiones.set(k,minNumberTemporal);
                }
            }
        }

        for(int value : sinRepeticiones){
            stringMinNumber.append(value);
        }
        return Integer.parseInt(stringMinNumber.toString());
    }
}