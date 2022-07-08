import java.util.ArrayList;

public class CafeUtil {

        public int getStreakGoal(){
            int current = 0;
            int numWeeks = 10;
            for (int i = current; i <= numWeeks; i++){
                current += i;
            }
            return current;
        }

        public Double getOrderTotal(double[] prices){
            double totalSum = 0;
            for(int i = 0; i < prices.length; i++){
                totalSum += prices[i];
            }
            return totalSum;
        }

        public void displayMenu(ArrayList<String> menuItems){
            for(int i = 0; i < menuItems.size(); i++){
                System.out.println(i + " " + menuItems.get(i));
            }
        }

        public void addCustomer(ArrayList<String> customers){
            System.out.println("Please enter your name: ");
            String userName = System.console().readLine();
            System.out.println("Hello " + userName);
            System.out.println("There are " + customers.size() + " people in front of you");
            customers.add(userName);
            for (int i = 0; i < customers.size(); i++){
                System.out.println(customers.get(i));
            }

        }

}




