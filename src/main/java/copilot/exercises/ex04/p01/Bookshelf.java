package copilot.exercises.ex04.p01;

public class Bookshelf {
    /*Bookshelfクラスには、最大で5冊の本を保持できるbookArrayという名前のString型配列を持ちます
- Bookshelfクラスには、以下の操作を定義してください（メソッド名は任意です）
#### 本を追加する
- 引数として受け取った本のタイトルをbookArrayに追加します
- もし既に5冊以上の本がある場合は、"本棚が満杯です"と出力して追加を行わないでください
*/
public String[] bookArray = new String[5];

public void addBook(String bookTitle) {
    for (int i = 0; i < bookArray.length; i++) {
        if (bookArray[i] == null) {
            bookArray[i] = bookTitle;
            break;
        } else {
            System.out.println("本棚が満杯です");
        }
    }
}
/* 
#### 本のリストを表示する
- bookArrayに格納されている本のタイトルをすべて出力します
- もし本が格納されていない場合は、"本棚は空です"と出力してください
*/

public void showBooks() {
    for (int i = 0; i < bookArray.length; i++) {
        if (bookArray[i] != null) {
            System.out.println(bookArray[i]);
        } else {
            System.out.println("本棚は空です");
        }
    }
}
/*
#### 本の数を返す
- 現在の本棚に格納されている本の数を返します */
public int getNumberOfBooks() {
    int count = 0;
    for (int i = 0; i < bookArray.length; i++) {
        if (bookArray[i] != null) {
            count++;
        }
    }
    return count;
}
}

