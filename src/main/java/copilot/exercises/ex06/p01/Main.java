package copilot.exercises.ex06.p01;

public class Main {
    /*palindromeCheckerメソッドを以下の要件で作成してください
  - String型の引数を受け取ります
  - 文字列が回文であればtrueを、そうでなければfalseを返します */
    public static boolean palindromeChecker(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*mainメソッドを以下の要件で作成してください
        palindromeCheckerメソッドを呼び出し、以下の文字列が回文かどうかを判定してください
  - 「level」
  */
        System.out.println(palindromeChecker("level"));
    }
}
