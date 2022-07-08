import java.rmi.server.SkeletonMismatchException;

public class Program {
    
    public static void main(String[] args){
        //to create a cat we do 
        Animal cat = new Animal("Pikachu", "Cat", 5, true);
//creating a penguin with penguin class without the overloaded version 
//constructor within the penguin class
        /* Penguin pete = new Penguin();
        // pete.setAge(20);
        // pet.setName("Pete");
        // pete.setIsMammal(true);
        // pete.setSpecies("Penguin");
        */

        Penguin pete = new Penguin("Pete", "penguin", 20, true);

        Deer bambi = new Deer();
        bambi.setAge(40);
        bambi.setName("Bambi");
        bambi.setSpecies("Deer");
        bambi.setIsMammal(true);

    }

};
