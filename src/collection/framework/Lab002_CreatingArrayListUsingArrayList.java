package collection.framework;

import java.util.ArrayList;

public class Lab002_CreatingArrayListUsingArrayList {

    public static void main(String[] args) {
        //Creation of ArrayList
        ArrayList list1 = new ArrayList(); //this can store different types of object values

        //Using add() we can add values in the lists created above
        list1.add("toy");
        list1.add('#');
        list1.add(-1);
        list1.add(true);
        list1.add(null);

        // Printing the list inputted
        System.out.println(list1);

        //Using get() we can access the values by index
        System.out.println(list1.get(0));

        //Removing the data from list using index
        list1.remove(0);
        System.out.println(list1);

        //Removing the data from list using Object
        list1.remove(null);
        System.out.println(list1);

        //checking the size of list
        System.out.println(list1.size());
    }
}
