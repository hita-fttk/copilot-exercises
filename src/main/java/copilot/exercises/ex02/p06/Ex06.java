package copilot.exercises.ex02.p06;

public class Ex06 {
    public static void main(String[] args) {
        /*mainメソッドの中で以下の処理を実装してください
  - 1から100までの素数を出力するプログラムを作成してください */
        for(int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
