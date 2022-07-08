import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "\nHello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return String.format("\nIt is Lovely to see you %s.", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("\nIt is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1){
            return String.format("\nI believe I can help you with that, Attentive and always ready to help, unlike others computers");
        }
        else if(conversation.indexOf("Alfred") > -1){
            return String.format("\nI am at your service. As you wish, naturally.");
        }
        else{
            return String.format("\nOkay, and with that I shall continue to search for memes\n");
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("\nGood %s. It is Lovely to see you %s.", dayPeriod, name);
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

