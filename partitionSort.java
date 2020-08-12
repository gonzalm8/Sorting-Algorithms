public class partitionSort{

    public static void main(String[] args) {

        int[] unsortedArray = convertArray(args);
        printArray(quickSort(unsortedArray,0, unsortedArray.length-1));
        
    }

    public static int[] convertArray(String[] args) {

        int[] unsortedA = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            unsortedA[i] = Integer.parseInt(args[i]);
        }

        return unsortedA;
    }

    public static int[] quickSort(int[] unsortedArray, int l, int h){

        if(l < h){

            int partitionIndex = findPartition(unsortedArray,l,h);
            quickSort(unsortedArray, l, partitionIndex-1);
            quickSort(unsortedArray, partitionIndex+1, h);
        }

        return unsortedArray;
    }

    public static int findPartition(int[] array, int low, int high){

        int partition = array[high];
        int pIndex = (low - 1);
        int swap;

        for(int j = low; j <= high-1; j++){
            if(array[j] < partition){
                pIndex++;
                swap = array[pIndex];
                array[pIndex] = array[j];
                array[j] =  swap;
            }
        }

        swap = array[pIndex + 1];
        array[pIndex + 1] = array[high];
        array[high] = swap;

        return pIndex +1;
    }

    public static void printArray(int[] sortedArray) {

        int i;

        for (i = 0; i < sortedArray.length - 1; i++) {
            System.out.print(sortedArray[i] + ", ");
        }

        System.out.println(sortedArray[i]);

    }
}