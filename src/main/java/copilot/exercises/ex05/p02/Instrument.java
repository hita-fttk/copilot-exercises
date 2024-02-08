package copilot.exercises.ex05.p02;

public interface Instrument {
    /*- Instrumentインタフェースには、playSoundメソッドとadjustSound()デフォルトメソッドを定義します
- InstrumentインタフェースのadjustSound()デフォルトメソッドは"Sound is adjusted."と表示します */
    public void playSound();
    
    default void adjustSound() {
        System.out.println("Sound is adjusted.");
    }
}
