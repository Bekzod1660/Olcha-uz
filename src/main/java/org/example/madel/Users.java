package org.example.madel;

public class Users extends Base{
    private String name;
    private String password;
    private int phone;
    private String role;

    public Users() {
    }

    public Users(String name, String password, int phone, String role) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id ='" + id + '\'' +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", role='" + role + '\'' +
                '}';
    }
}
