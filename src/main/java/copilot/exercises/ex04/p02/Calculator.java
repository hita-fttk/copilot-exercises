package copilot.exercises.ex04.p02;

public class Calculator {
    //Calculatorクラスには、以下の操作を定義してください（メソッド名は任意です）
    //整数型の配列numberArrayを持ちます
    public int[] numberArray = new int[5];

    /*数字を追加する
- 引数として受け取った整数をnumberArrayに追加します
- ただし、numberArrayのサイズは5で、
- 5つ以上の数字を追加しようとする場合は、"計算不能"という文字列を返します
- 追加できた場合はnullを返します */
    public String addNumber(int number) {
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == 0) {
                numberArray[i] = number;
                return null;
            } else {
                return "計算不能";
            }
        }
        return null;
    }
    /* 数字の合計を計算する
- numberArrayに格納されている数字の合計を計算し、その結果を返します
- ただし、numberArrayに数字が格納されていない場合は、0を返します*/
    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        return sum;
    }
}
