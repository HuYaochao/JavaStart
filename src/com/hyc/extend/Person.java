/**
 *
 * @author hyc
 * @date 2024/8/6
 * @version: 1.0
 */

package com.hyc.extend;

import java.util.Objects;

public class Person {
    private String id;
    private String gender;
    private String name;
    private String address;

    @Override
    public String toString(){
        return "id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // 检查类型和是否为 null
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // 转换为 Person 类型
        Person person = (Person) obj;
        // 比较 id
        return Objects.equals(id, person.id);
    }
    public Person(String id, String gender, String name, String address) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
