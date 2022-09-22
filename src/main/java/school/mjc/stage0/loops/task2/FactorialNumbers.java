package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        while (count <= printToInclusive) {
            int result = 1;
            int num = 2;
            while (num <= count) {
                result *= num;
                num++;
            }
            System.out.println(result);
            count++;
        }
    }
}
