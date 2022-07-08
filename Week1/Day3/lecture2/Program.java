public class Program {
    
    public static void main(String[] args){



        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        DynamicArray array = new DynamicArray();
        array.data.add(25);
        array.data.add(50);
        array.data.add(75);
        array.data.add(100);
        array.data.add(125);

        Iterator iterator = new Iterator(array);    //iterates the array from DynamicArray 
        Iterator iterator2 = new Iterator(list);    //Iterates the list from LinkedList

        iterator.Iterate();
        System.out.println("\n\n");
        iterator2.Iterate();

        
    }

}
