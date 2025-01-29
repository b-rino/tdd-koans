public class Demo {

    public String greet(Object o) {
        if (o == null) {
            return "Hello, my friend";
        }
        else if (o instanceof String) {
            String name = (String)o;

            if (name.equals(name.toUpperCase())) {
                return "HELLO, " + name;
            }

            return "Hello, " + name;
        }
        else if (o instanceof String[]) {
            String str = "";
            String[] names = ((String[]) o);

            for (int i = 0; i < names.length; i++) {
                if (i == names.length-1) {
                    str += " and ";
                    str += names[i];
                }
                else if (i == names.length-2){
                    str += names[i];
                }
                else {
                    str += names[i];
                    str += ", ";
                }
            }

            return "Hello, " + str;
        }

        return "";
    }


}
