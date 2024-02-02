package copilot.exercises.ex03.p01;

public class Ex01 {
    public static void main(String[] args) {
        /*fibonacciメソッドを以下の要件で作成してください
         - int 型の引数を受け取ります
            - 引数で受け取った数値以下のフィボナッチ数列を文字列として返します */
        System.out.println(fibonacci(10));
        
        
        
    }
    public static String fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        String str = "0, 1";
        while (c <= n) {
            c = a + b;
            a = b;
            b = c;
            str += ", " + c;
        }
        return str;
    }
}
