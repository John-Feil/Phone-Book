import java.util.*;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new HashMap<>();
    }


    public void add(String name, String phoneNumber) {
        this.phonebook.put(name,List.of(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        this.phonebook.put(name, List.of(phoneNumbers));
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return this.phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()){
            if (entry.getValue().contains(phoneNumber)){
                return entry.getKey();
            }
        }
        return "Invalid phoneNumber";
    }

    public List<String> getAllContactNames() {
        List<String> allNames = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()){
            allNames.add(entry.getKey());
        }
        return allNames;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}