public static int findNextPower(int val, int pow_) {

    double expo = Double.parseDouble(String.valueOf(pow_));
    double potencias;
    int nextPow;

    int accum =1;
    do{
        potencias = Math.pow(accum, expo);
        accum++;
    }while(!(potencias > val));

    nextPow = (int) potencias;
    return nextPow;  // <- Hajime!
}