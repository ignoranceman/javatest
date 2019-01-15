package demo.day04;

public class Student {
    private int studentNum;
    private String name;
    private int scores;

    public Student(int studentNum, String name, int scores) {
        this.studentNum = studentNum;
        this.name = name;
        this.scores = scores;
    }

    public Student() {

    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    private void Test(){

    }

}
