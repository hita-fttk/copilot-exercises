package copilot.exercises.ex05.p01;

public class Main {
    public static void main(String[] args) {
        /*  - Device型の配列を作成し、その配列にSmartphoneとLaptopのインスタンスを代入します
  - 配列内の各デバイスのpowerOnメソッドとuseDeviceメソッドをループして呼び出し動作を表示してください */
        Device[] devices = new Device[2];
        devices[0] = new Smartphone();
        devices[1] = new Laptop();
        for (Device device : devices) {
            device.powerOn();
            device.useDevice();
        }
    }
}
