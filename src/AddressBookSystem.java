import java.util.Scanner;

public class AddressBookSystem {

    //Scanner to take the input from user
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Displayed welcome message and object name contact has been created
        System.out.println("Welcome to address book system program in java");
        Contact contact = addContact();
        System.out.println(contact);
    }

    //addContact to set the user input and print it
    private static Contact addContact() {

        Contact contact = new Contact();
        System.out.println("Enter first name :");
        contact.setFirstName(scanner.next());
        System.out.println("Enter last name :");
        contact.setLastName(scanner.next());
        System.out.println("Enter address :");
        contact.setAddress(scanner.next());
        System.out.println("Enter city name :");
        contact.setCity(scanner.next());
        System.out.println("Enter state name :");
        contact.setState(scanner.next());
        System.out.println("Enter mobile number:");
        contact.setPhoneNumber(Integer.parseInt(scanner.next()));
        System.out.println("Enter zip code :");
        contact.setZipCode(Integer.parseInt(scanner.next()));
        System.out.println("Enter email id :");
        contact.setEmailId(scanner.next());
        System.out.println("Contact added successfully");
        return contact;
    }
}
