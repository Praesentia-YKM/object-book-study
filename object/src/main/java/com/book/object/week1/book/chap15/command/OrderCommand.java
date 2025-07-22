package com.book.object.week1.book.chap15.command;

// ===== COMMAND 패턴 - 주문 처리 시스템 =====
// 요청을 객체로 캡슐화하여 실행 취소, 로깅, 큐잉 등을 지원

// Command 인터페이스
interface OrderCommand {
    void execute();
    void undo();
    String getCommandInfo();
}
