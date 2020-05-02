package arrays;

public class Array {

    public static void main(String [] args) {

    int [] numbers = {2, -9,0,5,12,-25,22,9,8,12};
    int sum = 0;
    Double average ;

    // for each loop is used to access elments
        for (int number : numbers){
            sum += number;
        }

        int arrayLength = numbers.length;

        average = ((double) sum / (double) arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }


}
