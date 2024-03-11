package morseConverter;

import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args) {

        Converter converter = new Converter();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 if you want to convert Morse to text. " +
                "\nEnter 2 if you want to convert text to Morse.");

        try {

            int menuSelection = Integer.parseInt(scan.nextLine());

            switch (menuSelection) {
                case 1:
                    System.out.println("Enter a Morse code:");
                    System.out.println(converter.getText(scan.nextLine()));
                    break;
                case 2:
                    System.out.println("Please, enter a letter (A-Z):");
                    System.out.println(converter.getMorse(scan.nextLine()));
                    break;
                default:
                    System.out.println("Please, enter a valid option (1 or 2).");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid option (1 or 2).");
        }
    }
}



