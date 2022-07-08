public class TestOrders {
    public static void main(String[] args){
        //this is the instance to call from the Order class
        // Order order = new Order();
        // Item item = new Item();

        //menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 2.75;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 1.5;

        Item item3 = new Item();
        item3.name = "Drip coffee";
        item3.price = 2.25;

        Item item4 = new Item();
        item4.name = "Capuccino";
        item4.price = 3.25;
        //order variable -- order1, order2, etc.
        
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";


        //Application Simulations
//ORDER 2 
        order2.items.add(item1);
        order2.total += item1.price;

//ORDER 3 
        order3.items.add(item4);
        order3.total += item4.price;

//ORDER 4
        order4.items.add(item2);
        order4.total += item2.price;

//Sam ordered 2 more drinks, total of 3 drinks
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price * 2);
        
//ORDER STATUS
        order1.ready = true;

        order2.ready = true;

        order3.ready = false;

        order4.ready = false;



        //Use this example code to test various order updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    }

}
