package project.manage.people;
/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class Student extends People {
    private String studentId;
    private String className;

    public Student(String name, String gender, int age, String studentId, String className) {
        super(name, gender, age);
        this.studentId = studentId;
        this.className = className;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getClassName() {
        return className;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

