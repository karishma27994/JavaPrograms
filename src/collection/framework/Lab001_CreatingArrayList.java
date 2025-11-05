package collection.framework;

import java.util.*;

public class Lab001_CreatingArrayList {
    public static void main(String[] args) {
        //Creation of ArrayList
        ArrayList list1 = new ArrayList(); //this can store different types of object values
        ArrayList<Integer> list2 = new ArrayList<>(); //this can store only Integer type of values

        //We can create arraylist using parent class as well
        List list3 = new ArrayList();
        Collection list4 = new ArrayList();

        //Using add() we can add values in the lists created above
        //list1
        list1.add("toy");
        list1.add('#');
        list1.add(-1);

        //list2
        list2.add(0);
        list2.add(-1);
        list3.add(22);

        //list3
        list3.add(null);
        list3.add(true);
        list3.add(3.14);

        //list4
        list4.add(123456789123456l);
        list4.add("books");

        // Printing the list inputted
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

        //Using get() we can access the values by index
        System.out.println(list1.get(0));
        System.out.println(list2.get(1));
        System.out.println(list3.get(2));
        //System.out.println(list4.getClass());

        //Removing the data from list
        list1.remove(0);
        list4.remove("books");
        System.out.println(list1);
        System.out.println(list4);


    }
}
