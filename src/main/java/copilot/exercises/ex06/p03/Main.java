package copilot.exercises.ex06.p03;

public class Main {
    /*mainメソッドからisOverlappedメソッドを呼び出し、以下の期間が重なっているかどうかを判定してください */
    public static void main(String[] args) {
        java.time.LocalDate startDate1 = java.time.LocalDate.of(2020, 1, 1);
        java.time.LocalDate endDate1 = java.time.LocalDate.of(2020, 12, 31);
        Period period1 = new Period(startDate1, endDate1);
        java.time.LocalDate startDate2 = java.time.LocalDate.of(2021, 1, 1);
        java.time.LocalDate endDate2 = java.time.LocalDate.of(2021, 12, 31);
        Period period2 = new Period(startDate2, endDate2);
        System.out.println(period1.isOverlapped(period2));
    }
}
