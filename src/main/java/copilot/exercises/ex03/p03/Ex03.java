package copilot.exercises.ex03.p03;

public class Ex03 {
    public static void main(String[] args) {
        /*reverseString メソッドを使用して、引数が"Hello"の場合の結果を表示してください */
        System.out.println(reverseString("Hello"));
    }
    /*reverseString メソッドを以下の要件で作成してください
  - String 型の引数を受け取ります
  - 引数で受け取った文字列を逆順にして戻り値として返します */
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
