import java.util.*;
public class T2Q8 {
    public static void displayList(ArrayList<?> arrList){
        for (Object element : arrList){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        numOfCars.add(0);
        numOfCars.add(3);
        numOfCars.add(1);
        numOfCars.add(1);
        numOfCars.add(3);
        numOfCars.add(0);
        milesPerHour.add(0.3);
        milesPerHour.add(1.1);
        milesPerHour.add(3.0);
        milesPerHour.add(0.7);
        milesPerHour.add(0.2);
        milesPerHour.add(2.3);
        displayList(numOfCars);
        displayList(milesPerHour);
    }
}
