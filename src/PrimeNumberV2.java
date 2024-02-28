public class PrimeNumberV2 {
//    Vòng lặp while
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            int i = 2;
            while (i < number) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }

            return true;
        }

        public static void main(String[] args) {
            int number = 23;

            if (isPrime(number)) {
                System.out.println(number + " là số nguyên tố.");
            } else {
                System.out.println(number + " không là số nguyên tố.");
            }
        }
}
