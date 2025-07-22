package com.book.object.week1.book.chap15.composite;

// ===== COMPOSITE 패턴 - 조직도 시스템 =====
// 전체-부분 관계를 동일하게 처리할 수 있게 해주는 패턴

// 공통 인터페이스
interface OrganizationComponent {
    String getName();
    int calculateTotalSalary();
    void displayStructure(int depth);
    void addMember(OrganizationComponent component);
    void removeMember(OrganizationComponent component);
}
