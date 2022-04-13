import java.util.*;

public class Main {
    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();

        phonebook.add("John","484-915-6810");
        phonebook.add("Donna","610-259-5760");
        phonebook.addAll("Joe","915-234-5465","215,687,4956");
        phonebook.add("Mike","348-584-5869");
        phonebook.add("Katie","948-384-5968");

        System.out.println(phonebook.getAllContactNames());
        phonebook.remove("John");
        System.out.println(phonebook.getAllContactNames());

        System.out.println(phonebook.hasEntry("John"));
        System.out.println(phonebook.lookup("Joe"));
        System.out.println(phonebook.reverseLookup("215,687,4956"));
    }
}
