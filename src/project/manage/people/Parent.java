package project.manage.people;
/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class Parent extends People {
    private String relationship;
    private String contactNumber;

    public Parent(String name, String gender, int age, String relationship, String contactNumber) {
        super(name, gender, age);
        this.relationship = relationship;
        this.contactNumber = contactNumber;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}

