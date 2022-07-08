public class Program {
    public static void main(String[] args){

        Shopper shopper1 = new Shopper("Ray");
        Shopper shopper2 = new Shopper("Erick");

        Grocery apple = new Grocery ("Apple", 1.25);
        Grocery ribeye = new Grocery ("RibEye", 30.00);
        Grocery lobster = new Grocery ("lobster", 45.00);
        Grocery pear = new Grocery ("apple", 1.00);
        Grocery almonds = new Grocery ("almonds", 3.00);

        shopper1.addItem(apple);
        shopper1.addItem(lobster);
        shopper1.addItem(pear);
        
        Double rays_total = shopper1.getTotal();

        shopper2.addItem(ribeye);
        shopper2.addItem(almonds);

        Double ericks_total = shopper2.getTotal();

        System.out.println("Ray's Bill: $" + rays_total);
        System.out.println("Erick's Bill: $" + ericks_total);

        System.out.println(Shopper.numCustomers);

    }
}
