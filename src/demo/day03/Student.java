package demo.day03;

public class Student {

    String name;
    char gender;
    short age;
    int studentNum;

    void study(int hours){
        System.out.println(name+" has study " +hours+ "hours.");
    }
    void exam(int subjects){
        System.out.println(name+" have " +subjects+ " subjects must pass the exam.");
    }
    void vacation(int days){
        System.out.println(name+"'s vacation have " +days+ "days.");}

    public static void main(String[] args) {
        Student tom=new Student();
        tom.name="Tom";
        tom.study(5);
        tom.exam(6);
        tom.vacation(30);
    }
}
