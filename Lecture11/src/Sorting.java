public class Sorting {
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++){
            // find the minimum in the list[i...list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            // Insert current element into list[k+1]
            list[k+1] = currentElement;
        }
    }
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++){
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++){
                if (list[i] > list[i+1]){
                    // Swap list[i] with list[i+1]
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
    public static void mergeSort(int[] list){
        if (list.length > 1){
            // Merge sort the first half
            int[] firstHalf = new int[list.length/2];
            System.arraycopy(list,0,firstHalf,0,list.length/2);
            mergeSort(firstHalf);
            // Merge sort the second half
            int secondHalfLength = list.length - list.length/2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);
            // Merge firstHalf with secondHalf into list
            merge(firstHalf,secondHalf,list);
        }
    }
    public static void merge(int[] list1, int[] list2, int[] temp){
        int current1 = 0;// current index in list1
        int current2 = 0;// current index in list2
        int current3 = 0;// current index in temp
        while (current1 < list1.length && current2 < list2.length){
            if (list1[current1] < list2[current2]){
                temp[current3++] = list1[current1++];
            }
            else {
                temp[current3++] = list2[current2++];
            }
        }
        while (current1 < list1.length){
            temp[current3++] = list1[current1++];
        }
        while (current2 < list2.length){
            temp[current3++] = list2[current2++];
        }
    }
    public static void main(String[] args) {
        System.out.println("Selection Sort:");
        double[] list1 = {-2, 4.5, 5, 1, 2, -3.3};
        selectionSort(list1);
        for (int i = 0; i < list1.length; i++){
            System.out.print(list1[i] + " ");
        }
        System.out.println();
        System.out.println("Insertion Sort:");
        int[] list2 = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertionSort(list2);
        for (int i = 0; i < list2.length; i++){
            System.out.print(list2[i] + " ");
        }
        System.out.println();
        System.out.println("Bubble Sort:");
        int[] list3 = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list3);
        for (int i = 0; i < list3.length; i++){
            System.out.print(list3[i] + " ");
        }
        System.out.println();
        System.out.println("Merge Sort:");
        int[] list4 = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        mergeSort(list4);
        for (int i = 0; i < list4.length; i++){
            System.out.print(list4[i] + " ");
        }
        System.out.println();
    }
}