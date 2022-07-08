public class Deer extends Animal{
    
    public Deer(){
        super();
/*when we run the super() function, we go to Animal class and use down below

public Animal(){
//this is the default constructor 
        name = "Mighty Joe Young";
        species = "Gorilla";
        age = 8;
        isMammal = true;

    }

    */
    }

    public void Eat(String food){
        System.out.println(name + " eat's " + food + ".");
    }

}
