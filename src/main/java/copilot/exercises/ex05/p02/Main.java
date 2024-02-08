package copilot.exercises.ex05.p02;

public class Main {
    public static void main(String[] args) {
        /*mainメソッドを以下の要件で作成してください
  - Instrument型の配列を作成し、その配列にPianoとGuitarのインスタンスを代入します
  - 作成した配列を引数として、playConcertメソッドを呼び出してください */
        Instrument[] instruments = new Instrument[2];
        instruments[0] = new Piano();
        instruments[1] = new Guitar();
        playConcert(instruments);
    }

    /* playConcertメソッドを以下の要件で作成してください
  - Instrument型の配列を受け取ります
  - 引数で受け取った配列内の楽器を全て演奏し、音色を調整します */
    public static void playConcert(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            instrument.playSound();
            instrument.adjustSound();
        }
    }
}
