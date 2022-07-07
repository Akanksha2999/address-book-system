import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {

    //Scanner to take input from user
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Contact> addressBook = new ArrayList<Contact>();

    public static void main(String[] args) {

        System.out.println("Welcome to the Address Book Program");
        AddressBookSystem addressBookList = new AddressBookSystem();

        while (true) {
            System.out.println("1.Add contact" + "\n" + "2.Edit contact" + "\n" + "3.Delete contact" + "\n" + "4.Multiple contact");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressBookList.addContact();
                    break;
                case 2:
                    addressBookList.editContact();
                    break;
                case 3:
                    addressBookList.deleteContact();
                    break;
                case 4:
                    addressBookList.addMultipleContact();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    public void addContact() {
        Contact details = new Contact();
        System.out.println("Enter the first name:");
        details.setFirstName(scanner.next());
        System.out.println("Enter the last name:");
        details.setLastName(scanner.next());
        System.out.println("Enter the Address:");
        details.setAddress(scanner.next());
        System.out.println("Enter the City name:");
        details.setCity(scanner.next());
        System.out.println("Enter the state:");
        details.setState(scanner.next());
        System.out.println("Enter the email:");
        details.setEmailId(scanner.next());
        System.out.println("Enter the zip code:");
        details.setZipCode(scanner.nextInt());
        System.out.println("Enter the phone number:");
        details.setPhoneNumber(scanner.nextLong());

        addressBook.add(details);
        System.out.print(addressBook);
        System.out.println("Contact added successfully");
    }

    public void editContact() {
        System.out.println("Enter the name to edit contact details :");
        String editName = scanner.next();
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i).getFirstName().equals(editName)) {
                System.out.println("select options");
                System.out.println("\n0.First Name\n1.Last Name\n2.Address\n3.City\n4.State\n5.Zip\n6.Phone Number");
                int editOption = scanner.nextInt();

                switch (editOption) {
                    case 1:
                        System.out.println("Enter the First name:");
                        String editFirstName = scanner.next();
                        addressBook.get(i).setFirstName(editFirstName);
                        System.out.println(editFirstName);
                        break;
                    case 2:
                        System.out.print("Enter the Last name:");
                        addressBook.get(i).setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.print("Enter the Address:");
                        addressBook.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.print("Enter the city:");
                        addressBook.get(i).setCity(scanner.nextLine());
                        break;
                    case 5:
                        System.out.print("Enter the state:");
                        addressBook.get(i).setState(scanner.nextLine());
                        break;
                    case 6:
                        System.out.print("Enter the zip code:");
                        addressBook.get(i).setZipCode(scanner.nextInt());
                        break;
                    case 7:
                        System.out.print("Enter the phone number:");
                        addressBook.get(i).setPhoneNumber(scanner.nextLong());
                        break;
                    case 8:
                        System.out.print("Enter the email:");
                        addressBook.get(i).setEmailId(scanner.nextLine());
                        break;
                    default:
                        System.out.println("Enter valid contact");
                }
            }
            System.out.println("Edited contact is:");
            System.out.println(addressBook);
        }
    }

    public void deleteContact() {
        System.out.println("Enter the name to delete contact");
        String Name = scanner.next();
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i).getFirstName().equals(Name)) ;
            Contact person = addressBook.get(i);
            addressBook.remove(person);
        }
        System.out.println(addressBook);
    }

    public void addMultipleContact() {
        System.out.println("Enter number of contacts to add into contact book");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            addContact();
            System.out.println(i + 1 + " Contact added Successfully");
        }
    }
}