package be.intecbrussel;
//Opdracht1 Part5
public class ArrayOfPrimeNumber {
    public static void main(String[] args) {

        int[] primes = new int[100];
        int indexPrime = 0;
        for (int number = 2; number < 50; number++) {
            boolean isPrime = true;
            for (int divider = 2; divider <= number / 2; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                primes[indexPrime] = number;
                indexPrime++;

            }
        }
        for (int num : primes) {
            if (num == 0) {
                break;
            } else {
                System.out.println(num);
            }
        }
    }
}