package copilot.exercises.ex02.p10;

public class Ex10 {
    public static void main(String[] args) {
        /*mainメソッドの中で以下の処理を実装してください
  - 15より大きい２番目の偶数を出力する
  - breakとcontinueを両方使用して実装してください */
        int count = 0;
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                count = i;
                if(count == 2){
                    System.out.println(i);
                    break;
                }
            }
            if(i <= 15){
                continue;
            }
        }
    }
}
