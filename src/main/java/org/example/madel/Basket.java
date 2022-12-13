package org.example.madel;

public class Basket extends Base{
    private int bUsersId;
    private int productId;
    private int countP;
    private String time;
    private double totalAmount;
    private boolean buy;

    public Basket() {
    }

    public Basket(int bUsersId, int productId, int countP, String time, double totalAmount, boolean buy) {
        this.bUsersId = bUsersId;
        this.productId = productId;
        this.countP = countP;
        this.time = time;
        this.totalAmount = totalAmount;
        this.buy = buy;
    }

    public int getbUsersId() {
        return bUsersId;
    }

    public void setbUsersId(int bUsersId) {
        this.bUsersId = bUsersId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCountP() {
        return countP;
    }

    public void setCountP(int countP) {
        this.countP = countP;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isBuy() {
        return buy;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "bUsersId=" + bUsersId +
                ", productId=" + productId +
                ", countP=" + countP +
                ", time='" + time + '\'' +
                ", totalAmount=" + totalAmount +
                ", buy=" + buy +
                ", id=" + id +
                '}';
    }
}
