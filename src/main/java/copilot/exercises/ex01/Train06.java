package copilot.exercises.ex01;

public class Train06 {
    public static void main(String[] args) {
        /*- mainメソッドの中で以下の処理を実装してください
  - 整数型の変数 counter を宣言し、0 を代入します
  - counter に 3 を加え、その後 2 を掛けて counter の値を更新してください
  - 最終的に counter の値を表示してください

### 実行結果
```
counter: 6
``` */
        int counter = 0;
        counter += 3;
        counter *= 2;
        System.out.println("counter: " + counter);
    }
}
