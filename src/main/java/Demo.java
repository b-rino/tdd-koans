import java.util.ArrayList;
import java.util.List;

public class Demo {

    public String greet(Object o) {
        if (o == null) {
            return "Hello, my friend";
        }
        else if (o instanceof String[]) {
            return greetMany((String[])o);
        }
        else if (o.equals(((String)o).toUpperCase())) {
            return "HELLO, " + o;
        }

        return "Hello, " + o;
    }

    public String greetMany(String[] names) {
        String str = "Hello, ";
        List<String> lowercaseNames = new ArrayList<>();
        List<String> uppercaseNames = new ArrayList<>();

        for (String name : names) {
            if (name.equals(name.toUpperCase())) {
                uppercaseNames.add(name);
            }
            else {
                lowercaseNames.add(name);
            }
        }

        if (!lowercaseNames.isEmpty()) {
            str += lowercaseGreeting(lowercaseNames);
        }

        if (!uppercaseNames.isEmpty()) {
            str += uppercaseGreeting(uppercaseNames);
        }

        return str;
    }

    private String lowercaseGreeting(List<String> names) {
        String str = "";

        for (int i = 0; i < names.size(); i++) {
            if (i == names.size()-1) {
                str += " and ";
                str += names.get(i);
            }
            else if (i == names.size()-2){
                str += names.get(i);
            }
            else {
                str += names.get(i);
                str += ", ";
            }
        }

        return str;
    }

    private String uppercaseGreeting(List<String> names) {
        String str = "";

        str += ". AND HELLO ";
        for (String name : names) {
            str += name;
        }
        str += "!";

        return str;
    }
}
