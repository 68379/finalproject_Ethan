package final1;

public class Culminating {
    private String name;
    private double cost;
    private String url;
    private String group;
    private int money;
    private int number;

    public Culminating(String name, double cost, String url, String group,int number){
        this.name = name;
        this.cost = cost;
        this.url = url;
        this.group = group;
        this.number = number;
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

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return
                "Name = " + name  +
                ", Cost = " + cost +
                ", URL = " + url +
                ", Group = " + group ;
    }
}
