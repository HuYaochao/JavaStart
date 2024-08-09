package project.manage.impl;

import project.manage.people.Parent;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class ParentManagementImpl implements ParentManagement {
    private Map<String, Parent> parents = new HashMap<>();
    private Map<String, List<String>> studentParents = new HashMap<>();

    @Override
    public void addParent(Parent parent) {
        // 假设家长名字唯一
        parents.put(parent.getName(), parent); 
    }

    @Override
    public void removeParent(String parentId) {
        parents.remove(parentId);
    }

    @Override
    public void updateParent(Parent parent) {
        parents.put(parent.getName(), parent);
    }

    @Override
    public Parent getParent(String parentId) {
        return parents.get(parentId);
    }

    @Override
    public List<Parent> getParentsByStudentId(String studentId) {
        return studentParents.getOrDefault(studentId, Collections.emptyList()).stream()
                .map(parents::get)
                .collect(Collectors.toList());
    }
}

