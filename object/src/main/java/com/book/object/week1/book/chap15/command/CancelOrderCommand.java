package com.book.object.week1.book.chap15.command;

public class CancelOrderCommand implements OrderCommand {
    private final CreateOrderCommand originalCommand;

    public CancelOrderCommand(CreateOrderCommand originalCommand) {
        this.originalCommand = originalCommand;
    }

    @Override
    public void execute() {
        originalCommand.undo(); // 원본 명령의 역작업 수행
    }

    @Override
    public void undo() {
        originalCommand.execute(); // 원본 명령 재실행
    }

    @Override
    public String getCommandInfo() {
        return "주문취소: " + originalCommand.getCommandInfo();
    }
}
