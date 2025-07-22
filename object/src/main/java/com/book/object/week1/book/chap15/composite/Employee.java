package com.book.object.week1.book.chap15.composite;

import org.springframework.stereotype.Component;

// Leaf: 개별 직원
@Component
public class Employee implements OrganizationComponent {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int calculateTotalSalary() {
        return salary;
    }

    @Override
    public void displayStructure(int depth) {
        System.out.println("  ".repeat(depth) + "직원: " + name + " (연봉: " + salary + ")");
    }

    @Override
    public void addMember(OrganizationComponent component) {
        throw new UnsupportedOperationException("직원에게는 하위 조직을 추가할 수 없습니다.");
    }

    @Override
    public void removeMember(OrganizationComponent component) {
        throw new UnsupportedOperationException("직원에게는 하위 조직을 제거할 수 없습니다.");
    }
}
