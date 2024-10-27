public class Prime {
    public static boolean isPrime(int num) {
        int accumulator;
        int divisores;

        if (num < 2) {
            divisores = 0; // No es primo
        } else if (num == 2) {
            divisores = 2; // Es primo
        } else if (num % 2 == 0) {
            divisores = 0; // Números pares mayores que 2 no son primos
        } else {
            accumulator = 3;
            divisores = 2; // Inicialmente asumimos que es primo


            while (accumulator * accumulator <= num) {
                if (num % accumulator == 0) {
                    divisores++;
                    break;
                }
                accumulator += 2;
            }
        }
        return (divisores == 2) ? true : false; //TODO
    }
}