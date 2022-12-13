package org.example.madel;

public class Product extends Base{
    private String name;
    private int count;
    private int categoryId;
    private double amount;
    private double disCount;

    public Product() {
    }

    public Product(String name, int count, int categoryId, double amount, double disCount) {
        this.name = name;
        this.count = count;
        this.categoryId = categoryId;
        this.amount = amount;
        this.disCount = disCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDisCount() {
        return disCount;
    }

    public void setDisCount(double disCount) {
        this.disCount = disCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", count=" + count +
                ", categoryId=" + categoryId +
                ", amount=" + amount +
                ", disCount=" + disCount +
                '}';
    }
}
