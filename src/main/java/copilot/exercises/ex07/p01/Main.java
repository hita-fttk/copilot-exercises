package copilot.exercises.ex07.p01;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        /*### Main内の指示:
- ①ArrayList\<Cooking>を使用して料理を管理してください
- ②Cookingクラスのインスタンスを作成して、3つの料理を追加してください
- 「ステーキ」（価格: 2500円）、 「サラダ」（価格: 800円）、 「パスタ」（価格: 1200円）
- ③ArrayList\<Cooking>の中の料理の情報（名前と価格）を表示してください
- ④ある料理の価格を変更してください（例えば、ステーキの価格を3500円に変更するなど）
- ⑤ArrayList\<Cooking>の中の料理を価格の安い順に並び替えてください
- ⑥並び替えたArrayList\<Cooking>の中の料理の情報（名前と価格）を表示してください */
    List<Cooking> cookingList = new ArrayList<>();
    Cooking steak = new Cooking("ステーキ", 2500);
    Cooking salad = new Cooking("サラダ", 800);
    Cooking pasta = new Cooking("パスタ", 1200);
    cookingList.add(steak);
    cookingList.add(salad);
    cookingList.add(pasta);
    for (Cooking cooking : cookingList) {
        System.out.println(cooking.getName() + " : " + cooking.getPrice() + "円");

    }
}
}