import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        // printList(list);
        // list.add("Ravi");// Adding object in arraylist
        // printList(list);
        // list.add("Vijay");
        // printList(list);
        // list.add("Komal");
        // printList(list);
        // list.add("Ajay");
        // printList(list);

        // list.set(1, "Prasad");
        // printList(list);
        // System.out.println("Element at index 3 is: "+list.get(1));
        // boolean s1 = list.add("Shivani");
        // System.out.println(s1);
        // printList(list);
        // System.out.println("After removing the element list is :");
        // list.remove(1);
        // printList(list);

        // // boolean s2 = list.remove(list);
        add(list);
        printList(list);

        System.out.println("Size of the list is : "+list.size() );

       System.out.println(list.remove(0));



    }

    public static void printList(ArrayList list) {
        // Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void add(ArrayList list){
        list.add("Komal");
        list.add("Vaishnavi");
        list.add("Kunal");
        list.add("Tejas");
    
    }
}