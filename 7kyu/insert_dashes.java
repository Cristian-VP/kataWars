public static String insertDash(int num) {
    // Your code here...
    String numToString = String.valueOf(num);
    String oddNumsResult = "";

    if(numToString.length() > 1){
        for(int i = 0; i < numToString.length(); i++){
            if( i > 0 ){
                int actualIndex = Character.getNumericValue(numToString.charAt(i));
                int pastIndex = Character.getNumericValue(numToString.charAt(i-1));
                if (actualIndex%2 != 0 && pastIndex%2 !=0){
                    oddNumsResult = oddNumsResult+"-";
                }
            }
            oddNumsResult += ""+numToString.charAt(i);
        }
    }else{
        oddNumsResult = numToString;
    }
    return oddNumsResult;
}