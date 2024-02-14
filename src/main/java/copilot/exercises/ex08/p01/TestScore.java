package copilot.exercises.ex08.p01;

public class TestScore {
    private Integer testScoreId;
    private Integer studentId;
    private Integer score;
    private String subject;
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Integer getTestScoreId() {
        return testScoreId;
    }
}
