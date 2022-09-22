package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int x = 0;
        while (x <= printToInclusive) {
            if (x == 1 || x == 0) {
                x++;
                continue;
            }

            boolean isPrime = true;
            int y = 2;
            while (y <= x / 2) {
                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
                y++;
            }

            if (isPrime) {
                System.out.println(x);
            }

            x++;
        }
    }
}
