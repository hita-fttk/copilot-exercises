package copilot.exercises.ex05.p01;

public class Laptop extends Device{
    /*- SmartphoneクラスではpowerOnメソッドとuseDeviceメソッドをオーバーライドして特定の動作を追加し、LaptopクラスではuseDeviceメソッドをオーバーライドします
- SmartphoneクラスのpowerOnメソッドは、"Smartphone is powered on."と表示します
- SmartphoneクラスのuseDeviceメソッドは、"Smartphone is used."と表示します */
    @Override
    public void useDevice() {
        System.out.println("Laptop is used.");
    }
    
}
