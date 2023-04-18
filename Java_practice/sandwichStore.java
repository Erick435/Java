import java.util.Scanner;

public class sandwichStore {
    
    public static void main(String[] args) {

        //We call scanner as a way to get the input from our user
        Scanner scanner = new Scanner(System.in);


        //METHOD TO GET THE USERS SIZE CHOICE
        System.out.println("\nChoose the sandwich size\n1: Regular: base price $5.45\n2: Large: base price $8.95");
        //we need for the user to enter a integer as their answer 
        int oneOrTwo = scanner.nextInt();
        //we call basePriceOfSandwich method and use oneOrTwo as the parameter and 
        //We will hold that value in a double variable called usersSandwichSize
        double usersSandwichSize = basePriceOfSandwich(oneOrTwo);



        //ASK IF THEY WANT SANDWICH LOADED AND USE METHOD
        System.out.println("Would you like the sandwich loaded? Please type:\nYes\nNo");
        
        //Their answer needs to be a string or characters of y or n
        String loadedSandwich = scanner.next();
        
        //Do the following IF the user types yes
        if(loadedSandwich.equals("yes") || loadedSandwich.equals("Yes") || loadedSandwich.equals("Y") || loadedSandwich.equals("y")){

//We will use the additionalCost method to add the extra price for loaded sandwich
//userSandwich size contains the original price of regular or large(depending what the user wanted)
//by using the additionalCost method, we will add the extra price and the original and hold that
//value in a double called afterAdditionalCost
            double afterAdditionalCost = additionalCost(usersSandwichSize);
            
            //USE THE METHOD FOR THE AGE TO SEE IF THERE'S A DISCOUNT
            int personsAge = getPersonsAge();

            double finalTotalPrice = discountForAge(personsAge, afterAdditionalCost);
/*We will use the method discountForAge and enter the personsAge and afterAdditioncalCost
 * as their parameters, in the method, depending the age we get, they will receive a discount
 * then, use afterAdditionalCost and add it to the discount which will return the total.
 * We create a double variable named finalTotalPrice to hold the answer of the added discount
 * and after the extra price to get our final total
 */
            
            System.out.printf("Your final price after discount is: $%.2f", finalTotalPrice);

            
        }
        
        
        //We go here if the user selected no for loaded sandwich
        else if(loadedSandwich.equals("no") || loadedSandwich.equals("No") || loadedSandwich.equals("N") || loadedSandwich.equals("n")){
            //We determine the persons age to see if they qualify for a discount
            //And hold that age in a int variable called personsAge
            int personsAge = getPersonsAge();
            
            //We do the same thing (comments on line 40-45) and get the total price
            double finalTotalPrice = discountForAge(personsAge, usersSandwichSize);
            System.out.printf("Your final price is: $%.2f", finalTotalPrice);
        } 
        else{
            System.out.println("I'm sorry something went wrong");
        }
        scanner.close();

    }

    public static double basePriceOfSandwich(int numberOfInput){
        double regular = 5.45;
        double large = 8.95;
        double price;

        if(numberOfInput == 1){
            price = regular;
            System.out.println("You picked a regular which is: $" + price);
            return price;
        }
        else if(numberOfInput == 2){
            price = large;
            System.out.println("You picked a large which is: $"+ price);
            return price;
        }
        else{
            System.out.println("You must to type 1 or 2, this transaction has become void");
            return 0.00;
        }

    }

    public static double additionalCost(double costOfSandwich){
        double totalPrice;
        if (costOfSandwich == 5.45){
            totalPrice = costOfSandwich + 1.00;
            return totalPrice;
        }
        else if(costOfSandwich == 8.95){
            totalPrice = costOfSandwich + 1.75;
            return totalPrice;
        }
        else{
            System.out.println("There is something wrong");
            return 0.00;
        }
    }

    public static int getPersonsAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int getAge = scanner.nextInt();

        return getAge;
    }

    public static double discountForAge(int personAge, double afterAdditionalCost){
        double finalCost;
        System.out.println("The discount rates are as follows:\nStudent(17 or younger) = 10% discount" + 
        "\nSeniors (65 and older) = 20% disounts");
        if (personAge <= 17 && personAge >=0){
            finalCost = afterAdditionalCost * 0.9;
            System.out.println("\n You qualify for a student discount: 10% off your order");
            return finalCost;
        }
        else if (personAge >=65){
            finalCost = afterAdditionalCost * 0.8;
            System.out.println("\nYou qualify for a seniors discount: 20% off your order");
            return finalCost;
        }
        else{
            finalCost = afterAdditionalCost;
            System.out.println("\nYou do not qualify for a discount");
            return finalCost;
        }

    }


}
