package copilot.exercises.ex06.p02;

public class Main {
    /*mainメソッドを以下の要件で作成してください
  - ①LocalDateクラスを使って、今日の日付を「例）2023年12月31日」のフォーマットで出力してください
  - ②徳仁天皇の誕生日は、1960年2月23日です。徳仁天皇が生まれてから、今日で何年何ヶ月何日経過したかを出力してください */
    public static void main(String[] args) {
        System.out.println(java.time.LocalDate.now());
        java.time.LocalDate birthday = java.time.LocalDate.of(1960, 2, 23);
        java.time.LocalDate today = java.time.LocalDate.now();
        java.time.Period period = java.time.Period.between(birthday, today);
        System.out.println(period.getYears() + "年" + period.getMonths() + "ヶ月" + period.getDays() + "日");
    }
}
