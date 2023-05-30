
public class Question117 {
    public static void main(String[] args) {
        System.out.println(Question117.numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}
