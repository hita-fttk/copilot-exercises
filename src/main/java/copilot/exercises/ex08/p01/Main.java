package copilot.exercises.ex08.p01;

import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        /*### 問題
- 生徒とテストの点数を管理するための2つのエンティティクラス（Student、TestScore）を作成してください。これらのエンティティは、データベースのテーブルにマッピングされるようにします
- DAO（Data Access Object）クラスを作成し、それぞれのエンティティに対するデータベース操作を行うメソッドを実装してください。但し、以下の「Main内の指示」で必要となるメソッドのみでかまいません
- データベースへの接続やクエリの実行にはJDBCとPreparedStatementを使用してください。また適切なエラーハンドリングを含めてください */
        // 以下のコードを実行してください
        // StudentDAOクラスのselectAllメソッドを使用して、全ての生徒の情報を取得し、それぞれの生徒の情報を出力してください
        // StudentDAOクラスのselectByIdメソッドを使用して、idが1の生徒の情報を取得し、その生徒の情報を出力してください
        // StudentDAOクラスのinsertメソッドを使用して、新しい生徒の情報を追加してください
        // StudentDAOクラスのupdateメソッドを使用して、idが1の生徒の情報を更新してください
        // StudentDAOクラスのdeleteメソッドを使用して、idが1の生徒の情報を削除してください
        //StudentDAOクラスのselectAllメソッドを使用して、全ての生徒の情報を取得し、それぞれの生徒の情報を出力してください
        //StudentDAOクラスのselectByIdメソッドを使用して、idが1の生徒の情報を取得し、その生徒の情報を出力してください
        //StudentDAOクラスのinsertメソッドを使用して、新しい生徒の情報を追加してください
        //StudentDAOクラスのupdateメソッドを使用して、idが1の生徒の情報を更新してください
        //StudentDAOクラスのdeleteメソッドを使用して、idが1の生徒の情報を削除してくださ

        
        //JDBC接続のためのコードを書いてください
        StudentDAO studentDAO = new StudentDAO();
        Student student = new Student();
        PreparedStatement preparedStatement = null;
        studentDAO.selectAll(preparedStatement);
        studentDAO.selectById(preparedStatement, 1);
        studentDAO.insert(preparedStatement, student);
        studentDAO.update(preparedStatement, student);
        studentDAO.delete(preparedStatement, 1);

        // 以下のコードを実行してください
        // TestScoreDAOクラスのselectAllメソッドを使用して、全てのテストの点数の情報を取得し、それぞれのテストの点数の情報を出力してください
        // TestScoreDAOクラスのselectByIdメソッドを使用して、idが1のテストの点数の情報を取得し、そのテストの点数の情報を出力してください
        // TestScoreDAOクラスのinsertメソッドを使用して、新しいテストの点数の情報を追加してください
        // TestScoreDAOクラスのupdateメソッドを使用して、idが1のテストの点数の情報を更新してください
        // TestScoreDAOクラスのdeleteメソッドを使用して、idが1のテストの点数の情報を削除してください
        Student student = new Student();
        PreparedStatement preparedStatement = null;
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.selectAll(preparedStatement);
        studentDAO.selectById(preparedStatement, 1);
        studentDAO.insert(preparedStatement, student);
        studentDAO.update(preparedStatement, student);
        studentDAO.delete(preparedStatement, 1);
        TestScore testScore = new TestScore();
        TestScoreDAO testScoreDAO = new TestScoreDAO();
        testScoreDAO.selectAll(preparedStatement);
        testScoreDAO.selectById(preparedStatement, 1);
        testScoreDAO.insert(preparedStatement, testScore);
        testScoreDAO.update(preparedStatement, testScore);
        testScoreDAO.delete(preparedStatement, 1);


    }
}
