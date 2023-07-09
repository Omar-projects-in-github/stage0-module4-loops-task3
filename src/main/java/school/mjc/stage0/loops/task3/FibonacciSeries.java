package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int beforePreviousElement = 0, previousElement = 1;
        for (int i = 0; i < lastFibonacci; i++) {
            if (i == 0)
                System.out.println(0);
            else if (i == 1)
                System.out.println(1);
            else {
                int element = beforePreviousElement + previousElement;
                System.out.println(element);
                beforePreviousElement = previousElement;
                previousElement = element;
            }
        }
    }
}
