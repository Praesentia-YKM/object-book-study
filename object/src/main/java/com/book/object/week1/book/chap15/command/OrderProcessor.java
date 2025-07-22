package com.book.object.week1.book.chap15.command;

import org.springframework.stereotype.Service;

import java.util.Stack;

// Invoker: 명령을 실행하고 관리하는 객체
@Service
public class OrderProcessor {
    private final Stack<OrderCommand> executedCommands = new Stack<>();

    public void processOrder(OrderCommand command) {
        try {
            command.execute();
            executedCommands.push(command);
            System.out.println("명령 실행 완료: " + command.getCommandInfo());
        } catch (Exception e) {
            System.err.println("명령 실행 실패: " + command.getCommandInfo() + " - " + e.getMessage());
        }
    }

    public void undoLastOrder() {
        if (!executedCommands.isEmpty()) {
            OrderCommand lastCommand = executedCommands.pop();
            lastCommand.undo();
            System.out.println("명령 취소 완료: " + lastCommand.getCommandInfo());
        } else {
            System.out.println("취소할 명령이 없습니다.");
        }
    }

    public void showCommandHistory() {
        System.out.println("=== 명령 실행 이력 ===");
        executedCommands.forEach(cmd -> System.out.println("- " + cmd.getCommandInfo()));
    }
}
