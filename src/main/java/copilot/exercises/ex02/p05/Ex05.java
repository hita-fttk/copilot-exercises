package copilot.exercises.ex02.p05;

public class Ex05 {
    public static void main(String[] args) {
        /* mainメソッドの中で以下の処理を実装してください
  - 九九の表を逆順で表示するプログラムを作成してください
  - String.formatやSystem.out.printfは使用しないでください */
        for (int i = 9; i > 0; i--) {
            for (int j = 9; j > 0; j--) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
