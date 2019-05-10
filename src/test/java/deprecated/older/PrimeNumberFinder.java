package deprecated.older;

public class PrimeNumberFinder {
    public long[] primes = new long[100000];

    public static void main(String[] args) {
        PrimeNumberFinder finder = new PrimeNumberFinder();

        long time = System.currentTimeMillis();
        finder.find(100000);
        for (long prime : finder.primes) {
            if (prime == 0) break;
            System.out.println(prime);
        }
        System.out.println("Time: " + (System.currentTimeMillis() - time) + " ms");
    }

    public void find(long max) {
        primes[0] = 2;
        int count = 0;
        for (long i = 3; i < max; i += 2) {
            if (isPrime(i)) {
                primes[count] = i;
                count++;
            }
        }
    }

    public boolean isPrime(long number) {
        for (long p : primes) {
            if (p == 0) break;
            if (number % p == 0)
                return false;
        }
        return true;
    }
}
