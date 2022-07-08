public class TestOrder {
    
    public static void main(String[] args){

        //Menu Items
        Item item1 = new Item("Mocha", 3.5);
        Item item2 = new Item("Drip Coffee", 2.0);
        Item item3 = new Item("Tea", 2.25);
        Item item4 = new Item("Orange Juice", 1.75);

        //Orders (first two are unspecified names)
        Order order1 = new Order();
        Order order2 = new Order();

        //Orders, create 3 orders with names
        Order order3 = new Order("Erick");
        Order order4 = new Order("Steve");
        Order order5 = new Order("Jasmine");

        //add 2 items to each order, use "order3.addItem(item1)"
        //order 1
        order1.addItem(item2);
        order1.addItem(item4);
        
        //order 2
        order2.addItem(item1);
        order2.addItem(item2);
        
        //order3
        order3.addItem(item3);
        order3.addItem(item4);
        //order 4
        order4.addItem(item4);
        order4.addItem(item4);

        //order 5
        order5.addItem(item1);
        order5.addItem(item2);

        //Test getstatusmessage function using "order2.setReady(true);" && System.out.println(order2.getStatusMessage());
        
        order1.setReady(true);
        System.out.println("\nHello there " + order1.getName() + ", " + order1.getStatusMessage() + "\n");
        
        order2.setReady(true);
        System.out.println("Hello there " + order2.getName() + ", " + order2.getStatusMessage() + "\n");
        
        order3.setReady(false);
        System.out.println("Hello there " + order3.getName() + ", " + order3.getStatusMessage() + "\n");
        
        order4.setReady(false);
        System.out.println("Hello there " + order4.getName() + ", " + order4.getStatusMessage() + "\n");
        
        order5.setReady(true);
        System.out.println("Hello there " + order5.getName() + ", " + order5.getStatusMessage() + "\n");

        //Test the total using "System.out.println(order1.getOrderTotal());"
        //order1
        // System.out.println(order1.getOrderTotal());
        order1.display();
        
        // System.out.println(order2.getOrderTotal());
        order2.display();
        
        // System.out.println(order3.getOrderTotal());
        order3.display();
        
        // System.out.println(order4.getOrderTotal());
        order4.display();
        
        // System.out.println(order5.getOrderTotal());
        order5.display();


    }

}
