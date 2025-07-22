package com.book.object.week1.book.chap15.composite;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// Composite: 부서
@Component
public class Department implements OrganizationComponent {
    private final String departmentName;
    private final List<OrganizationComponent> members = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getName() {
        return departmentName;
    }

    @Override
    public int calculateTotalSalary() {
        return members.stream()
                .mapToInt(OrganizationComponent::calculateTotalSalary)
                .sum();
    }

    @Override
    public void displayStructure(int depth) {
        System.out.println("  ".repeat(depth) + "부서: " + departmentName);
        members.forEach(member -> member.displayStructure(depth + 1));
    }

    @Override
    public void addMember(OrganizationComponent component) {
        members.add(component);
    }

    @Override
    public void removeMember(OrganizationComponent component) {
        members.remove(component);
    }
}

