public static String remove(String str) {
    // your code here
    String stringRemove ="";
    for(int i = 1; i < str.length()-1; i++){
        stringRemove += str.charAt(i);
    }
    return stringRemove;
}