package ss2_loop.bai_tap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Số thỏa mãn: " + N);
            }
            N++;
        }
    }
}
