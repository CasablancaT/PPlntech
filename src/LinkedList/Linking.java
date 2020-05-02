package LinkedList;

import com.sun.corba.se.spi.orbutil.proxy.LinkedInvocationHandler;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linking {

    public static void main(String[] args) {


        Deque<String> animals = new LinkedList<>();

        // add elements at the start of linkedlist
        animals.addFirst("Tiger");
        animals.addFirst("Lions");
        animals.addFirst("Cat");
        System.out.println("Linked list : " + animals);

        // add elements at the end of the linkedlist
        animals.addLast("Zebra");
        System.out.println("New Linkedlist : " + animals);

        // get the first element from the linkedlist
        String string = animals.getFirst();
        System.out.println("fIRST ELEMENT : " + string );

        // get the last element from linked list
        String stringone = animals.getLast();
        System.out.println("Last Element :" + stringone);

        // access te first elemnt of the linkedlist
        String stringtwo = animals.peek();
        System.out.println("Element ccessed  " + stringtwo);
        System.out.println("New linkedlist : " + animals);

        // returns and removes the first element
        String stringthree = animals.poll();
        System.out.println("Removed element : " + stringthree);
        System.out.println("New linked list : " + animals);



    }
}