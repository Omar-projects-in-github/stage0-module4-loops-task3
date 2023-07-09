package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int greatestDivisor = 1, lowerValue = Math.min(first, second);
        if (lowerValue == 0)
            System.out.println(Math.max(first, second));
        else {
            for (int i = 2; i <= lowerValue; i++) {
                int temporaryDivisor = 1;
                if (first % i == 0 && second % i == 0)
                    temporaryDivisor = i;
                if (temporaryDivisor > greatestDivisor)
                    greatestDivisor = temporaryDivisor;
            }
            System.out.println(greatestDivisor);
        }
    }
}
