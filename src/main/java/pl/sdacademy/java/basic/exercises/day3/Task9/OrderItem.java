package pl.sdacademy.java.basic.exercises.day3.Task9;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;
    public OrderItem(String productName, int quantity, double price){
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    double getAmount(){
        double amount = quantity*price;
        return amount;
    }
    boolean isCorrect(){
        boolean correct = (quantity > 0 && price > 0);
        return correct;
    }

    void print(){
        //Cukier | 4,00 zł | 3 pcs | 12,00 zł
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append("\t| ");
        sb.append(price).append("zł\t| ");
        sb.append(quantity).append("psc\t| ");
        sb.append(getAmount()).append(" zł");
        System.out.println(sb);
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }
}
