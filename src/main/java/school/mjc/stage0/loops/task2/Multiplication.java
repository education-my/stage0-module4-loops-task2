package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive != 0) {
            int count = 0;
            while (count <= Math.abs(multiplyByAndToInclusive)) {
                System.out.println(count * multiplyByAndToInclusive);
                count++;
            }
        }
    }
}
