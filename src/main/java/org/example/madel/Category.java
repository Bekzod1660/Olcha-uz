package org.example.madel;

public class Category extends Base{
    private String name;
    private int parentId;

    public Category() {
    }

    public Category(String name, int parentId) {
        this.name = name;
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", parentId=" + parentId +
                ", id=" + id +
                '}';
    }
}
