import java.util.ArrayList;
import java.util.HashMap;

public class Program {
    public static Integer add(Integer a, Integer b){
        return a + b;
    }
    public static void main(String[] args){
        float PI = 3.14159F;
        Float otherPI = 3.14159F;

        int myAge = 20;
        Integer myDogAge = 4;
        String hello = "World";

        char myGrade = 'C';
        char myGrades[] = new char[10];
        myGrades[0] = 'C';
        myGrades[1] = 'B';
        myGrades[2] = 'D';
        myGrades[3] = 'F';
        myGrades[4] = 'A';
        // myGrades[10] = 'z';

        // for (int i = 0; i < myGrades.length; i++){
        //     if (i % 2 ==0){
        //         System.out.println(myGrades[i]);
        //     }
        //     else if (myGrades[i] == 'F'){
        //         System.out.println("You failed");
        //     }
        //     else{
        //         System.out.println("None of the above occured");
        //     }
        // }

        // for (char grade: myGrades){
        //     System.out.println(grade);  //same as the for loop to get the 
        //     //indexs of [i]
        // }

        // Integer theSum= add(myDogAge, myAge);
        // System.out.println(theSum);

    //Creating and allocating an ArrayList of Strings
        ArrayList<String> students = new ArrayList<>();
        students.add("Erick");
        students.add("Stephen");
        students.add("Michael");
        students.add("George");
        students.set(3, "David");

        //Iterating a Dynamic array / Arraylist
        // for(int i = 0; i < students.size(); i++){
        //     System.out.println(students.get(i));
        // }

        // //Iterating a fixed / static array
        // for(int i = 0; i < students.length(); i++){
        //     System.out.println(students[i]);
        // }

        for(String names: students){
            System.out.println(names);
        }

//Using a map (hashmap), doing this automatically imports from the library
//First argumenttt is the key type
//2nd arguement is the value type
        HashMap<String,String> animals = new HashMap<String, String>();
        animals.put("dog", "Yogi");
        animals.put("dog", "Leslie");
        animals.put("cat", "Meowmers");

        for(String key: animals.keySet()){
            System.out.println(animals.get(key));
        }

        animals.forEach((key,value)->{
            System.out.println(key + ":" + value);
        });
        
    }
}
