import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> person = new HashMap<>();

    public void setPerson(String name, String phoneNumber) {
        if (this.person.containsKey(name)) {
            getPhoneNumber(name).add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            this.person.put(name, numbers);
        }
    }

    public ArrayList<String> getPhoneNumber(String name) {
        return person.get(name);
    }
}
