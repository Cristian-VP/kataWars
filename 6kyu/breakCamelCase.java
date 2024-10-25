public static String camelCase(String input) {
    String outputString = "";
    if(input.length()>1){
        for(int i=0; i<input.length();i++){
            char currentIndx = input.charAt(i);
            if(Character.isUpperCase(currentIndx)){
                outputString+=""+" "+currentIndx;
            }else{
                outputString+=""+currentIndx;
            }
        }
    }else{
        outputString = input;
    }
    return outputString;
}