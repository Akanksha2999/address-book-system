import org.junit.Test;

import java.util.Arrays;

public class AddressBookSystemTest {
    @Test
    public void givenContactDetails() {
        Contact[] array = new Contact[]{
                new Contact("Akanksha", "Jadhav", "Mumbai", "Mumbai", "Maharashtra", "akanksha@", 400075, 882816646),
                new Contact("Sangeeta", "Thakur", "NaviMumbai", "Mumbai", "Maharashtra", "sangeeta@", 574165, 98928898),
        };
        AddressBookSystem addressBookClass;
        addressBookClass = new AddressBookSystem(Arrays.asList(array));
        addressBookClass.writeTheData(AddressBookSystem.IOService.FILE_IO);
    }

    @Test
    public void readTheContactDetails() {
        AddressBookSystem addressBookClass = new AddressBookSystem();
        addressBookClass.readContactDetails(AddressBookSystem.IOService.FILE_IO);
    }
}
