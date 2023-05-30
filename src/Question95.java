public class Question95 {
    public static void main(String[] args) {
        int num =1;
        int ans = Question95.prime(num);
        System.out.println(ans > 0 ? "Prime" : "Not Prime");
    }

    public static int prime(int num) {
        if (num % 2 == 0 && num != 2) {
            return -1;
        } else if (num == 2) {
            return 1;
        } else {
            for (int i = 2; i <= (num / 2); i++) {
                if (num % i == 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
}
