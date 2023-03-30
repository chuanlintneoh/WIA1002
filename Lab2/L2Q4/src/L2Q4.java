public class L2Q4 {
    public static <T extends Comparable<T>> String minmax(T[] arr){
        T min = arr[0];
        T max = arr[0];
        for (T element: arr){
            if (element.compareTo(max) > 0){
                max = element;
            }
            if (element.compareTo(min) < 0){
                min = element;
            }
        }
        return String.format("Min = %s \t Max = %s",min,max);
    }
}
