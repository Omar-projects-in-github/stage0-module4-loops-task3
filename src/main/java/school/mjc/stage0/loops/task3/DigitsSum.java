package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        if (t < 0)
            t = Math.abs(t);
        String stringT = "" + t;
        for (int i = 0; i < stringT.length(); i++) {
            sum += Integer.parseInt(stringT.charAt(i) + "");
        }
        System.out.println(sum);
    }
}
