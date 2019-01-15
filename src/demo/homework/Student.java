package demo.homework;

public class Student {

    /* 学生管理系统
    1. 权限认证
    2. 学生管理
    3. 学生数据统计与分析
    */
    public static void main(String[] args) {
        System.out.println("请输入您要执行的操作：");
    }

    int id;
    String name;
    int age;
    char gender;

    public Student() {

    }

    public Student(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }


    Student[] stu = new Student[5];
    Student stu1 = new Student(1001, "张三", 18, '男');
    Student stu2 = new Student(1002, "小花", 21, '女');
    Student stu3 = new Student(1001, "李四", 21, '男');
    Student stu4 = new Student(1002, "小红", 18, '女');


    /**
     * 权限认证
     *
     * @param id：学生编号
     */
    public void Permissiom(int id) {
        boolean flag = false;
        for (int i = 0; i < stu.length; i++) {
            if (id == stu[i].getId()) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("身份验证成功");
        } else {
            System.out.println("身份验证失败");
        }
    }

    /**
     * 查看学生数量
     *
     * @return
     */
    public int quantity() {
        int size = 0;
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getId() != 0) {
                size++;
            }
        }
        return size;
    }

    /**
     * 打印全部学生信息
     */
    public void printStudent() {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getId() != 0) {
                System.out.println(stu[i].getId() + "," + stu[i].getName() + "," + stu[i].getAge() + "," + stu[i].getGender());
            }
        }
    }

    /**
     * 查询指定id的学生信息
     *
     * @param id：学号
     */
    public void getById(int id) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getId() == id) {
                System.out.println(stu[i].getId() + "," + stu[i].getName() + "," + stu[i].getAge()+"," + stu[i].getGender());
                break;
            }
        }
    }

    /**
     * 删除指定id的学生信息
     *
     * @param id：学号
     */
    public void remove(int id) {
        boolean flag = false;
        int num = 0;
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getId() == id) {
                flag = true;
                num = i;
            }
        }
        if (flag) {
            for (int i = num; i < stu.length; i++) {
                stu[num] = stu[num + 1];
            }
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败，未找到该学生信息");
        }
    }

    /**
     * 添加学生
     *
     * @param student
     */
    public void add(Student student) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getId() == 0) {
                stu[i] = student;
                break;
            }
        }
    }

    /**
     * 修改学生信息
     *
     * @param student
     * @return 当查询到指定id的学生时，修改学生信息，否则返回null
     */
    public Student update(Student student) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getId() == student.getId()) {
                stu[i] = student;
                return student;
            }
        }
        return null;
    }
}

