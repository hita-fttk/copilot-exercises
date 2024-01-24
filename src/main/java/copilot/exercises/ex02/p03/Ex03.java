package copilot.exercises.ex02.p03;

public class Ex03 {
    public static void main(String[] args) {
        /*mainメソッドの中で以下の処理を実装してください
  - forループを使用して、以下のようなピラミッドを出力してください */
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
