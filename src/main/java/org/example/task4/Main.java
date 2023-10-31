package org.example.task4;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 7, 10};
        boolean[] isPrime = findPrimeElements(numbers);
        printResults(isPrime);
    }

    public static boolean[] findPrimeElements(int[] array) {
        boolean[] isPrime = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            isPrime[i] = isNumberPrime(array[i]);
        }
        return isPrime;
    }

    public static boolean isNumberPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number <= 1 || number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number) + 1; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printResults(boolean[] isPrime) {
        for (boolean prime : isPrime) {
            System.out.println(prime);
        }
    }
}
