package com.book.object.week1.book.chap15.command;

// Concrete Commands
public class CreateOrderCommand implements OrderCommand {
    private final Long orderId;
    private final String productName;
    private final int quantity;
    private final int amount;
    private final String shippingAddress;

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public CreateOrderCommand(Long orderId, String productName, int quantity, int amount,
                            String shippingAddress, InventoryService inventoryService,
                            PaymentService paymentService, ShippingService shippingService) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.amount = amount;
        this.shippingAddress = shippingAddress;
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
    }

    @Override
    public void execute() {
        inventoryService.decreaseStock(productName, quantity);
        paymentService.processPayment(orderId, amount);
        shippingService.arrangeShipping(orderId, shippingAddress);
    }

    @Override
    public void undo() {
        shippingService.cancelShipping(orderId);
        paymentService.refundPayment(orderId, amount);
        inventoryService.increaseStock(productName, quantity);
    }

    @Override
    public String getCommandInfo() {
        return "주문생성: " + orderId + " - " + productName + " " + quantity + "개";
    }
}
