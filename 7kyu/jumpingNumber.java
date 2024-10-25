public static String jumpingNumber(int number)
{
    String numString = String.valueOf(number);
    String jumpOrNot = "";
    if(numString.length()== 1){
        jumpOrNot = "Jumping!!";
    }else{
        for(int i=0; i < numString.length()-1; i++){
            int currentInx = Character.getNumericValue(numString.charAt(i));
            int nextInx =Character.getNumericValue(numString.charAt(i+1)) ;
            int restInx = currentInx - nextInx;
            if (restInx == 1 || restInx == -1){
                jumpOrNot = "Jumping!!" ;
            }else{
                jumpOrNot = "Not!!";
                break;
            }
        }
    }
    return jumpOrNot;
}