package copilot.exercises.ex03.p04;

public class Ex04 {
    public static void main(String[] args) {
        /*greatestCommonDivisorメソッドを使用して、引数が 24 と 36 の場合の最大公約数を表示してください
 */
        System.out.println(greatestCommonDivisor(1223, 771));
    }
    /*greatestCommonDivisorメソッドを以下の要件で作成してください
  - 2 つの int 型引数を受け取ります
  - 引数で受け取った 2 つの数値の最大公約数を計算し、その値を戻り値として返します */
    public static int greatestCommonDivisor(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b ; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
