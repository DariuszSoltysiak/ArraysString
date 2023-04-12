import java.util.Scanner;

public class ArraysString {
    public static void main(String[] args) {
        boolean seek = false;
        String[] familySoltysiak = {"Bogusia", "Darek", "Jacek", "Karolina", "Julek", "Sylwek", "Teresa"};

        System.out.println("Give me the name");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        for (int i = 0; i < familySoltysiak.length; i++) {
            if (familySoltysiak[i].equals(name)) { //UWAGA!! do porównania Stringa używa się metody equals!!
                seek = true;
                break;
            }
        }
        if (seek) {
            System.out.println(name + " is a member of Soltysiak family");
        } else {
            System.out.println(name + " is not a member of Soltysiak family ");
        }
    }
}