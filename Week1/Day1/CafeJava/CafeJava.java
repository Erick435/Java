import java.util.function.Function;

public class CafeJava {
    public static void main(String[] args){
        //APP VARIABLES
        //Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = " Your total is $";

        //Menu variables (add yours below)
        double mochaPrice = 5.5; //before: 3.5
        double dripCoffee = 4.5; //before: 2.5
        double latte = 5.75; //before 2.75
        double cappuccino = 2.5; //before 3.0

        //Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        //Order completions (add yours below)
        boolean isReadyOrder1 = true; //before false
        boolean isReadyOrder2 = false; //before true
        boolean isReadyOrder3 = false; //before true
        boolean isReadyOrder4 = true; //before false

        //APP INTERACTION SIMULATION (Add your code for the challenges below)
        //Example:
        //Cindhuri
        System.out.println("\n" + generalGreeting + customer1 + pendingMessage); //Displays "Welcome
        //to Cafe Java, Cindhuri"
        //Your customer interaction print statements will go here 

        //Noah
        if (isReadyOrder4){
            System.out.println(generalGreeting + customer4 + readyMessage + displayTotalMessage + cappuccino);
        }
        else{
            System.out.println("\n" + generalGreeting + customer4 + pendingMessage);
        }
        //Sam
        if (isReadyOrder2){
            System.out.println("\n" + generalGreeting + customer2 + displayTotalMessage + (latte * 2) + pendingMessage);
        }
        else{
            System.out.println("\n" + generalGreeting + customer2 + displayTotalMessage + (latte * 2) + readyMessage);
        }
        
        //Jimmy
        if(isReadyOrder3){
            System.out.println("\nOrder Changed, from: Drip Coffe, to: Latte. Difference: " + "+" +(latte - dripCoffee));
            System.out.println(generalGreeting + customer3 + displayTotalMessage + (latte));
            System.out.println("Sorry for the inconvenience! Enjoy and Come back soon!\n");
        }
        else{
            System.out.println("\nOrder Changed, from: Drip Coffe, to: Latte. Difference: " + "+" +(latte - dripCoffee));
            System.out.println(generalGreeting + customer3 + pendingMessage + displayTotalMessage + latte);
            System.out.println("Sorry for the inconvenience! Enjoy and Come back soon!\n");

        }
        

    }
}
