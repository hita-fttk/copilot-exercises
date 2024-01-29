package copilot.exercises.ex03.p02;

public class Ex02 {
    public static void main(String[] args) {
        /*isPrimeメソッドを使用して、引数が 17 の場合の結果を表示してください */
        System.out.println(isPrime(17));
    }

    /*isPrimeメソッドを以下の要件で作成してください
  - int 型の引数を受け取ります
  - 引数で受け取った数値が素数であるかどうかを判定し、true（素数）または false（素数でない）を戻り値として返します */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
