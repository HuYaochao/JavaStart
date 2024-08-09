package project.manage.people;
/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public abstract class People {
    protected String name;
    protected String gender;
    protected int age;

    public People(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

