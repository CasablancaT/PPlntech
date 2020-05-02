package LinkedList;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {

    public static void main(String[] args) {

     LinkedList <String> animals = new LinkedList<>();

     // add elements to the linked list
        animals.add("Dog");
        animals.add("Cat");
        animals.add("horse");

        // create an objeect of list iterator
        ListIterator <String> listIterator = animals.listIterator();
        System.out.print("Linkedlist : " ) ;

        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex());
            System.out.println(".");
        }

        // iterate backwards
        System.out.println(" reverse iteration : ");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
            System.out.println(".");
        }




    }
}
