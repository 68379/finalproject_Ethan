package indomaret;

public class Indomaret {
    private String name;
    private double cost;
    private int quantity;
    private String role;

    public Indomaret(String name, double cost, int quantity, String Class){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.role = Class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return
                "name = " + name  +
                ", cost = " + cost +
                ", quantity = " + quantity +
                ", role = " + role
                ;
    }
}
