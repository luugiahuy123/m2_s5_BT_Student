package ss5.BT_Student;

public class Student {
    private String name = "John";
    private String class1 = " CO2";

    public Student(){
    }
    public Student(String name, String class1) {
        this.name = name;
        this.class1 = class1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", class1='" + class1 + '\'' +
                '}';
    }
}
