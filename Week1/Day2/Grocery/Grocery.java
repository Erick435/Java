public class Grocery {
    
    private String name;
    private Double cost;
    public Grocery(String name, Double cost){
        this.cost = cost;
        this.name = name;
    }

    public void setCost(Double cost){
        this.cost = cost;
    }

    public Double getCost(){
        return this.cost;
    }

}
