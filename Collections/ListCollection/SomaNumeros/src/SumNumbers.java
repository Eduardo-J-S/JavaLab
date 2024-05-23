import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    List<Integer> intList;

    public SumNumbers() {
        this.intList = new ArrayList<>();
    }

    public void addNumber(int number){
        this.intList.add(number);
    }

    public int calculateSum(){
        if (intList.isEmpty()) {
            throw new IllegalStateException("The list is empty. Cannot calculate sum.");
        }

        int sumResult = 0;
        for (Integer integer : intList) {
            sumResult += integer;
        }

        return sumResult;
    }
    
    public int findLargestNumber(){
        if (intList.isEmpty()) {
            throw new IllegalStateException("The list is empty.");
        }

        int largestNumber = this.intList.get(0);
        for (Integer integer : intList) {
            if(integer > largestNumber){
                largestNumber = integer;
            }
        }
        return largestNumber;
    }

    public int findSmallestNumber(){
        if (intList.isEmpty()) {
            throw new IllegalStateException("The list is empty.");
        }

        int smallestNumber = this.intList.get(0);
        for (Integer integer : intList) {
            if(integer < smallestNumber){
                smallestNumber = integer;
            }
        }
        return smallestNumber;
    }

    public List<Integer> displayNumbers(){
        if (intList.isEmpty()) {
            throw new IllegalStateException("The list is empty. There are no numbers to display.");
        }
        return new ArrayList<>(intList);
    }
}
