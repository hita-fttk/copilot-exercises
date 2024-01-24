package copilot.exercises.ex02.p08;

public class Ex08 {
    public static void main(String[] args) {
        /*mainメソッドの中で以下の処理を実装してください
  - 1から50までの数値で、3の倍数、または5の倍数を出力してください */
        for(int i = 1; i <= 50; i++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
