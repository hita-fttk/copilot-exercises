package copilot.exercises.ex06.p03;

public class Period {
    /*期間（Period）クラスを以下の要件を満たすように作成してください
  - 開始日と終了日をフィールドで持ちます
  - 自分自身が持つ期間と引数で受け取った期間が重なっているかどうかを判定するメソッドisOverlapped()を持ちます
  - このメソッドは、Period型の引数を受け取り、自分自身と引数の期間が重なっていればtrueを、そうでなければfalseを返します */
    private java.time.LocalDate startDate;
    private java.time.LocalDate endDate;

    public Period(java.time.LocalDate startDate, java.time.LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isOverlapped(Period period) {
        return this.startDate.isBefore(period.endDate) && period.startDate.isBefore(this.endDate);
    }
}
