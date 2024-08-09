package project.manage.impl;

import project.manage.people.Parent;

import java.util.List;
/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */


public interface ParentManagement {
    void addParent(Parent parent);
    void removeParent(String parentId);
    void updateParent(Parent parent);
    Parent getParent(String parentId);
    List<Parent> getParentsByStudentId(String studentId);
}

