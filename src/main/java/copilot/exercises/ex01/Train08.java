package copilot.exercises.ex01;

public class Train08 {
    public static void main(String[] args) {
        /*mainメソッドの中で以下の処理を実装してください
  - 整数型の変数 number を宣言し、初期値として 8 を代入します
  - number を3回インクリメントして、その後2回デクリメントしてください
  - 最終的に number の値を表示してください

### 実行結果
```
number: 9
``` */
        int number = 8;
        number++;
        number++;
        number++;
        number--;
        number--;
        System.out.println("number: " + number);
    }
}
