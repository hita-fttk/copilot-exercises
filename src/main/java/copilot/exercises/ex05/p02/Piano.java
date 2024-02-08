package copilot.exercises.ex05.p02;

public class Piano implements Instrument{
    /*PianoクラスのplaySoundメソッドは、"Piano sound is played."と表示します */
    @Override
    public void playSound() {
        System.out.println("Piano sound is played.");
    }
}
