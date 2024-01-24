package copilot.exercises.ex02.p07;

public class Ex07 {
    public static void main(String[] args) {
        /*mainメソッドの中で以下の処理を実装してください
   - 最初の10個のフィボナッチ数列を出力してください(配列は使わないでください) */
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i = 0; i < 8; i++){
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
