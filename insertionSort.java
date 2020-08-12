/* Insertion Sort 
 * Author: Mario Gonzalez
 * Date: 08/10/2020
 * 
 * 
 * Simple Insertion Sort Implementation
 */


public class insertionSort{
 public static void main(String[] args) {

     int[] unsortedArray = convertArray(args);
     printArray(sortArray(unsortedArray));

 }

 public static int[] convertArray(String[] args){
     
    int[] unsortedA = new int[args.length];

    for(int i = 0; i < args.length; i++){
        unsortedA[i] = Integer.parseInt(args[i]);
    }

    return unsortedA;
 }

 public static int[] sortArray(int[] nums){
    
    int swap = 0;

    for(int i = 1; i < nums.length; i++){
        //check to see if numbers position needs to be changed
        if(nums[i-1] > nums[i]){
            //loop backwards from the offending position
            for(int j = i; j > 0; j--){
                //check to see if numbers need to be swapped again
                if(nums[j-1] > nums[j]){
                    swap = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = swap;
                }
            }
        }
    }
    return nums; //for the mean time so that it doesnt yell at me
 }

 public static void printArray(int[] sortedArray){
     
    int i;

    for(i = 0; i < sortedArray.length - 1; i++){
        System.out.print(sortedArray[i] + ", ");
    }

    System.out.println(sortedArray[i]);

 }
}


