import java.util.ArrayList;

public class Order {
    
    //member variables
    private String name; //default value of nul;l
    private boolean ready; //default value false
    private ArrayList<Item> items = new ArrayList<Item>(); //defaults to null

    //Constructor
    //no arguments, sets name to "Guest", initializes items as an empty list
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    //OVERLOADED CONSTRUCTOR 
    //Takes a name as an argumeent, sets name to this custom name
    //Initializes items as an empty list
    public Order(String name){
        this.name = name;
        this.ready = false;
    }

    //ORDER METHODS

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if (ready == true){
            return "Your order is ready!";
        }
        else{
            return "Thank you for waiting. Your order will be ready shortly";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.printf("\nCustomer Name: %s \n", this.name);
        for (Item i: this.items){
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $ " + this.getOrderTotal() + "\n");
    }

    //GETTERS & SETTERS

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    public ArrayList<Item> getItems(){
        if (items == null){
            System.out.println("You have no items");
        }
        return items;
    }



}
