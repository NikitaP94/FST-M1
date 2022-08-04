package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Tom");
        myList.add("jerry");
        myList.add("jelly");
        myList.add("erica");
        myList.add("arina");

        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }

        System.out.println("--------------------------------");

        System.out.println("3rd name in the Arraylist----"+ myList.get(2));

        System.out.println("--------------------------------");

        if(myList.contains("jerry")){
            System.out.println("jerry is available");
        }else{
            System.out.println("jerry is not available");
        }

        System.out.println("--------------------------------");

        System.out.println("Size of the arraylist--"+ myList.size());

        System.out.println("--------------------------------");

        myList.remove(3);
        System.out.println("After removing the Size of the arraylist--"+ myList.size());

    }
}
