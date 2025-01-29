public class Demo {

    public String greet(String name) {
        if (name == null) {
            return "Hello, my friend";
        }
        else if (name.equals(name.toUpperCase())){
            return "HELLO, " + name;
        }
        return "Hello, " + name;
    }
}
