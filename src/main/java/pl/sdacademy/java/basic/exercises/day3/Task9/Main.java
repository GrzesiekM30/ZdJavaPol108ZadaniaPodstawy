package pl.sdacademy.java.basic.exercises.day3.Task9;

public class Main {
    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem("Cukier",3,4);
        OrderItem orderItem2 = new OrderItem("Mleko",10,3.5);
        OrderItem orderItem3 = new OrderItem("Jajko",7,3);
        OrderItem orderItem4 = new OrderItem("Mąka",7,8);
        OrderItem orderItem5 = new OrderItem("Woda",4,1.01);
        Order order = new Order(5);
        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
        order.addItem(orderItem5);
        order.print();
    }
}
