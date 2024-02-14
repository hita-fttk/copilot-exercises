package copilot.exercises.ex07.p01;

public class Cooking {
    //このクラスは、料理の名前(String型)と価格(int型)の2つの属性を持ちます
    private String name;
    private int price;

    public Cooking(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
