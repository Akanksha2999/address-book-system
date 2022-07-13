import java.util.*;
import java.util.stream.Collectors;

public class AddressBookSystem {

    //Scanner to take input from user
    public static final Scanner scanner = new Scanner(System.in);
    public static final ArrayList<Contact> addressBook = new ArrayList<Contact>();

    public static void main(String[] args) {

        System.out.println("Welcome to the Address Book Program");
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        boolean condition = true;
        while (condition == true) {
            System.out.println("1.Add contact" + "\n" + "2.Edit contact" + "\n" + "3.Delete contact" + "\n" + "4.Multiple contact");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressBookSystem.addContact();
                    break;
                case 2:
                    addressBookSystem.editContact();
                    break;
                case 3:
                    addressBookSystem.deleteContact();
                    break;
                case 4:
                    addressBookSystem.addMultipleContact();
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

    public void showContacts() {
        if (addressBook.isEmpty()) {
            System.out.println("Address book is empty");
        } else {
            Set<Contact> productSet = addressBook.stream().collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Contact::toString))));
            productSet.forEach(System.out::println);
        }
    }

    //Method to search for desired contact
    public void searchMethod() {
        System.out.println("Enter the city or state to search contact ");
        String input = scanner.next();
        for (Contact book : addressBook) {
            if (book.getCity().equals(input) || book.getState().equals(input)) {
                System.out.println("Matches with city name contact is :" + book);
            } else {
                System.out.println("Contact not found");
            }
        }
    }

    //Method to sort the
    public void sortingByPersonName() {
        if (addressBook.isEmpty()) {
            System.out.println("Contacts book is empty");
        } else {
            addressBook.stream().sorted(Comparator.comparing(Contact::getFirstName)).forEach(System.out::println);
        }
    }

    public void sortingByCity() {
        if (addressBook.isEmpty()) {
            System.out.println("Contact book is empty");
        } else {
            addressBook.stream().sorted(Comparator.comparing(Contact::getCity)).forEach(System.out::println);
        }
    }

    public void countCity() {
        System.out.println("Enter a city name ");
        String input = scanner.next();
        long count = addressBook.stream().filter(city -> city.getCity().equals(input)).count();
        System.out.println("No of contacts Matched " + input + " city is : " + count);
    }
}