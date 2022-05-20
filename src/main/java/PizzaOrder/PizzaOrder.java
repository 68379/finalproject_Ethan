package PizzaOrder;

public class PizzaOrder {
private String foodsize;
private String order;
private double cost;

public PizzaOrder(String foodsize,String order,double cost){
    this.order = order;
    this.foodsize = foodsize;
    this.cost = cost;

}

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFoodsize() {
        return foodsize;
    }

    public void setFoodsize(String foodsize) {
        this.foodsize = "what size?";
    }


    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = "what size?";
    }
        @Override
        public String toString() {
            return order + foodsize;
        }
    }

