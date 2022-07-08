public class Animal {
    
    protected String name;
    protected String species;
    protected Integer age;
    protected Boolean isMammal;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSpecies(){
        return this.species;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Boolean getIsMammal(){
        return this.isMammal;
    }

    public void setIsMammal(Boolean isMammal){
        this.isMammal = isMammal;
    }

    public Animal(){
//this is the default constructor 
        name = "Mighty Joe Young";
        species = "Gorilla";
        age = 8;
        isMammal = true;

    }

    //using an overloader
    public Animal(String name, String species, Integer age, Boolean isMammal){
        this.name = name;
        this.species = species;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void Eat(Animal animal){
        System.out.println(name + " eat's " + animal.name);
    }

}
