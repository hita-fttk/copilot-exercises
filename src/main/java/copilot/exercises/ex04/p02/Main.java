package copilot.exercises.ex04.p02;

public class Main {
    public static void main(String[] args) {
        /*mainメソッドで以下を行ってください
  - Calculatorオブジェクトを作成します
  - 数字を4つ追加します
  - 数字の合計を計算し、その値を出力します
  - さらに2つの数字を追加しようと試みますが、numberArrayのサイズは5であるため計算不能"という文字列が出力されることを確認します */
        Calculator calculator = new Calculator();
        calculator.addNumber(1);
        calculator.addNumber(2);
        calculator.addNumber(3);
        calculator.addNumber(4);
        System.out.println(calculator.sumNumbers());
        System.out.println(calculator.addNumber(5));
        System.out.println(calculator.addNumber(6));
    
}
}
