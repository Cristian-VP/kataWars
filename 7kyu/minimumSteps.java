public static int minimumSteps(int[] numbers, int k) {
    // Your Code is Here ... Enjoy !!!
    Arrays.sort(numbers);
    int suma = 0;
    int accumulator = 0;
    int sumaAcc = -1;

    while(!(suma>=k)){
        suma += numbers[accumulator];
        accumulator++;
        sumaAcc++;
    }
    return sumaAcc;
}