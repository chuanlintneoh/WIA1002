import java.util.*;
public class tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList<String> managementSystem = new SinglyLinkedList<>();

        System.out.println("Enter your student name list. Enter 'n' to end.....");
        String name;
        while (!(name = sc.nextLine()).equals("n")){
            managementSystem.add(name);
        }
        System.out.println();

        System.out.println("You entered the following students' name:");
        managementSystem.printList();
        System.out.println();

        System.out.println("The number of students entered is: " + managementSystem.getSize());
        System.out.println();

        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        char option = sc.next().charAt(0);
        while (option != 'r' && option != 'n'){
            System.out.println("Invalid input! Please try again.");
            option = sc.next().charAt(0);
        }
        System.out.println();

        if (option == 'r'){
            System.out.println("Enter the existing student name that you want to rename:");
            sc.nextLine();//read the newLine character from nowhere??!
            String mistake = sc.nextLine();
            while (!managementSystem.contains(mistake)){
                System.out.println("Name not found! Please try again.");
                mistake = sc.nextLine();
            }
            System.out.println();
            System.out.println("Enter the new name:");
            String correction = sc.nextLine();
            managementSystem.replace(mistake,correction);
            System.out.println();
            System.out.println("The new student list is:");
            managementSystem.printList();
            System.out.println();
        }

        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        option = sc.next().charAt(0);
        while (option != 'y' && option != 'n'){
            System.out.println("Invalid input! Please try again.");
            option = sc.next().charAt(0);
        }
        System.out.println();

        if (option == 'y'){
            System.out.println("Enter a student name to remove:");
            sc.nextLine();
            String remove = sc.nextLine();
            while (!managementSystem.contains(remove)){
                System.out.println("Name not found! Please try again.");
                remove = sc.nextLine();
            }
            managementSystem.removeElement(remove);
            System.out.println();
            System.out.println("The number of updated student is: " + managementSystem.getSize());
            System.out.println("The updated students list is:");
            managementSystem.printList();
            System.out.println();
        }

        System.out.println("All student data captured complete. Thank you!");
    }
}
