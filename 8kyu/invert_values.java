public class Kata {
    public static int[] invert(int[] array) {

        if(array.length == 0){
            return array;
        }else{
            int[] arrayInverted = new int[array.length];
            System.out.println(arrayInverted);
            for(int i= 0 ; i< array.length; i++){
                arrayInverted[i] = -(array[i]);
            }
            return arrayInverted;
        }
    }
}