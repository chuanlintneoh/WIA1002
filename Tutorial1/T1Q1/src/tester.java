public class tester {
    public static void main(String[] args) {
        Telephone[] telephones = new Telephone[5];
        int number = 4968527;
        for (int i = 0; i < telephones.length; i++){
            telephones[i] = new Telephone("019",Integer.toString(number));
            System.out.println(telephones[i].makeFullNumber());
            number++;
        }
    }
}
