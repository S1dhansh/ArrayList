import java.util.*;
public class TestList {
    public static void main(String args[]){
        ArrayList<Integer> number = new ArrayList<>();
        //adding elements to array list
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        //Removing elements at index 2
        number.remove(2);

        //Update the elements at index 2
        number.set(2,100);

        //Retrieve and print the elements at index 3
        System.out.println("Elements at index 3: " + number.get(3));

        //Search for the elements 30 in the arrayList

        int index = number.indexOf(30);
        if(index != -1){
            System.out.println("Element 30 found at index: " + index);
        }
        else{
            System.out.println("Elements 30 not found in the arrayList");
        }

        //Calculate and print the sum of all elements
        int sum=0;
        for (int numbers : number){
            sum += numbers;
        }
        System.out.println("Sum of all elements :" + sum);

        //Check if the arrayList is empty
        if(number.isEmpty()){
            System.out.println("The arrayList is empty");
        }
        else{
            System.out.println("The arrayList is not empty");
        }

        //Clear all elements from the arrayList

        number.clear();

    }
}
