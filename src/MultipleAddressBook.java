import java.util.*;

public class MultipleAddressBook {

    static AddressBookSystem addressBookSystem = new AddressBookSystem();
    static Map<String, AddressBookSystem> addressBookClassMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    //Main method asking the options for desired input from user
    public static void main(String[] args) {
        System.out.println("Welcome To address book program");
        boolean condition = true;
        while (condition) {
            System.out.println("choose options \n1 : Add new addressBook\n2 : Add contact\n3 : Edit contact\n4 : Delete contact\n5 : Add multiple contacts\n6 : Show contacts\n7 : Search person by city or state\n8 : Sort by person name\n9 : Sort contact by city\n10 : exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addAddressBook();
                    break;
                case 2:
                    addAddressBookContact();
                    break;
                case 3:
                    editAddressBookContact();
                    break;
                case 4:
                    deleteAddressBookContact();
                    break;
                case 5:
                    addMultipleContactsToAddressBook();
                    break;
                case 6:
                    showContactsOfAddressBook();
                    break;
                case 7:
                    searchByCityOrState();
                    break;
                case 8:
                    sortingByPersonName();
                    break;
                case 9:
                    sortingByCity();
                    break;
                case 10:
                    condition = false;
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    //Method to print the created new address book with name
    public static void addAddressBook() {
        System.out.println("Creating a new address book\nEnter the address book name: ");
        String addressBookName = scanner.next();
        AddressBookSystem book = addressBookClassMap.get(addressBookName);
        if (book == null) {
            addressBookClassMap.put(addressBookName, addressBookSystem);
            System.out.println(addressBookClassMap.entrySet());
            System.out.println("Successfully added new address book");
        } else {
            System.out.println("AddressBook with this name already exists ");
        }
    }

    //Method to print the added contact details to desired address book
    public static void addAddressBookContact() {
        System.out.println("Enter the address book name: ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookClassMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("No address book found with these name");
        } else {
            addressBook.addContact();
        }
    }

    ////Method to print the edited contact details of desired address book
    public static void editAddressBookContact() {

        System.out.println("Enter the address book name: ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookClassMap.get(bookName);
        AddressBookSystem addressBookList = new AddressBookSystem();
        if (book == null) {
            System.out.println("No address book found with these name");
        } else {
            addressBookSystem.editContact();
        }
    }

    //Method to print deleted contact details of desired address book
    public static void deleteAddressBookContact() {
        System.out.println("Enter the address book name: ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookClassMap.get(bookName);
        AddressBookSystem addressBookList = new AddressBookSystem();
        if (book == null) {
            System.out.println("No address book found with these name");
        } else {
            addressBookSystem.deleteContact();
        }
    }

    //Method to print the multiple contacts to address book
    public static void addMultipleContactsToAddressBook() {
        System.out.println("Enter the address book name: ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookClassMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("No address book found with these name");
        } else {
            addressBookSystem.addMultipleContact();
        }
    }

    //Method to show all the contacts of a particular address book without duplicate contact
    public static void showContactsOfAddressBook() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBookSystem.showContacts();
        }
    }

    //Method to print the searched contact in address book
    public static void searchByCityOrState() {
        System.out.println("Enter the address book name ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBookSystem.searchMethod();
        }
    }

    //Method to print the sorted contacts according to person name
    public static void sortingByPersonName() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBookSystem.sortingByPersonName();
        }
    }

    public static void sortingByCity() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBookSystem.sortingByCity();
        }
    }
}
