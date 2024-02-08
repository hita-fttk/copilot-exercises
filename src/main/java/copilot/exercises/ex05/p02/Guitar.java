package copilot.exercises.ex05.p02;

public class Guitar implements Instrument{
    /*- GuitarクラスではadjustSoundメソッドをオーバーライドして特定の動作を追加しますが、Pianoクラスではオーバーライドする必要はありません
- GuitarクラスのadjustSoundメソッドは、"Guitar sound is adjusted."と表示します
- GuitarクラスのplaySoundメソッドは、"Guitar sound is played."と表示します */
    @Override
    public void adjustSound() {
        System.out.println("Guitar sound is adjusted.");
    }

    @Override
    public void playSound() {
        System.out.println("Guitar sound is played.");
    }
}
