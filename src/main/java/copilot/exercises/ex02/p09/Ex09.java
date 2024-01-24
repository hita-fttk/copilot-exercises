package copilot.exercises.ex02.p09;

public class Ex09 {
    public static void main(String[] args) {
        /*mainメソッドの中で以下の処理を実装してください
  - whileループを使用して、10から1までの偶数を逆順で出力する */
        int i = 10;
        while(i > 0){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i--;
        }
    }
}
