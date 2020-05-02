package hashmap;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {

        // create a hashmap of even numbers
        HashMap <String , Integer> evenNumbers = new HashMap<>();
        evenNumbers.put("Two" , 2);
        evenNumbers.put("Four", 4);
        System.out.println("Hashmap : " + evenNumbers);;

        // creating a hashmap from other hashmap
        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("Hashmap 2 : " + numbers);

        // using the putifbsent

        evenNumbers.putIfAbsent("Six" , 6);
        System.out.println("Hshmap of even numbers " + evenNumbers);

        // using entryset
        System.out.println("Key value mapping " + evenNumbers.entrySet());

        // using key set
        System.out.println("Using ket set : " + evenNumbers.keySet());

        // values
        System.out.println("Values are : " + evenNumbers.values());

        // remove key with single aprmeter
        int value = numbers.remove("Two");
        System.out.println(" removed value is : " + value);

        // remove a method with 2 different parmeters
        boolean result = numbers. remove("Three" , 3);
        System.out.println("Is the entry three removed ? : " + result);

    }
}
