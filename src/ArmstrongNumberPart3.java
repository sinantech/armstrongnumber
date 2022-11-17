public class ArmstrongNumberPart3 {
    public static void main(String[] args) {
        int i = 1, a, arm, n, temp;
        System.out.println("Armstrong Number Between 1 to 500");
        while (i < 500) {
            n = i;
            arm = 0;
            while (n > 0) {
                a = n % 10;
                arm = arm + (a * a * a);
                n = n / 10;
            }
            if (arm == i)
                System.out.println(i);
            i++;
        }
    }
}
