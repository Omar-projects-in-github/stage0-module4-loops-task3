package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0)
            System.out.println(0);
        else {
            int sum = 9, addingNumber = 9;
            for (int i = 2; i <= lengthOfLastNumber; i++) {
                addingNumber = addingNumber * 10 + 9;
                sum += addingNumber;
            }
            System.out.println(sum);
        }
    }
}
