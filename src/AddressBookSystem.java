import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {

    //Scanner to take input from user
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Contact> contact = new ArrayList<>();
    private static final Contact addressBook = new Contact();

    //Main method asking user to add or edit contact option
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System Program");
        while (true) {
            System.out.println("Select the options \n1.Add contact\n2.Edit contact");
            int options = scanner.nextInt();
            switch (options) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContacts();
                    break;
            }
        }
    }

    //Method to add new contact to address book
    public static void addContact() {
        System.out.println("Enter the first name :");
        addressBook.setFirstName(scanner.next());
        System.out.println("Enter the last name :");
        addressBook.setLastName(scanner.next());
        System.out.println("Enter the Address :");
        addressBook.setAddress(scanner.next());
        System.out.println("Enter the City name :");
        addressBook.setCity(scanner.next());
        System.out.println("Enter the state name :");
        addressBook.setState(scanner.next());
        System.out.println("Enter the email id :");
        addressBook.setEmailId(scanner.next());
        System.out.println("Enter the zip code :");
        addressBook.setZipCode(Integer.parseInt(scanner.next()));
        System.out.println("Enter the phone number :");
        addressBook.setPhoneNumber(scanner.nextLong());
        contact.add(addressBook);
        System.out.println(contact);
        System.out.println("Contact added successfully");
    }


    //Method to edit the desired contact from address book
    public static void editContacts() {
        System.out.println("Enter first name to edit ");
        String editName = scanner.next();
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equals(editName) || contact.get(i).getLastName().equals(editName)) {
                System.out.println("Select options \n1.first name \n2.last name\n3.address\n4.city\n5.state\n6.email\n7.zipcode\n8.phoneNum ");
                int edit = scanner.nextInt();
                switch (edit) {
                    case 1: {
                        System.out.println("Enter first name ");
                        String editFirstName = scanner.next();
                        contact.get(i).setFirstName(editFirstName);
                        System.out.println(editFirstName);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter last name ");
                        String editLastName = scanner.next();
                        contact.get(i).setLastName(editLastName);
                        System.out.println(editLastName);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Address ");
                        String editAddress = scanner.next();
                        contact.get(i).setAddress(editAddress);
                        System.out.println(editAddress);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter city ");
                        String editCity = scanner.next();
                        contact.get(i).setCity(editCity);
                        System.out.println(editCity);
                        break;
                    }
                    case 5: {
                        System.out.println("Enter state ");
                        String editState = scanner.next();
                        contact.get(i).setState(editState);
                        System.out.println(editState);
                        break;
                    }
                    case 6: {
                        System.out.println("Enter email ");
                        String editEmail = scanner.next();
                        contact.get(i).setEmailId(editEmail);
                        System.out.println(editEmail);
                        break;
                    }
                    case 7: {
                        System.out.println("Enter zipcode");
                        String editZip = scanner.next();
                        contact.get(i).setZipCode(Integer.parseInt(editZip));
                        System.out.println(editZip);
                        break;
                    }
                    case 8: {
                        System.out.println("Enter phone number ");
                        long editPhoneNumber = scanner.nextLong();
                        contact.get(i).setPhoneNumber(editPhoneNumber);
                        System.out.println(editPhoneNumber);
                    }
                    default:
                        System.out.println("Exit the loop");
                }
                System.out.println("Contact edited successfully");
                System.out.println(contact);
            } else {
                System.out.println("Contact not found ");
            }
        }
    }
}