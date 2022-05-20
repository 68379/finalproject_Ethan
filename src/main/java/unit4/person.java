package unit4;

public class person {
    private String name;
    private int age;
    private String prefix;

    public person(String name, int age, String prefix) {
        this.name = name;
        this.age = age;
        this.prefix = prefix;
    }

    public String getCategory() {
        if (prefix == "Mrs" && age > 40) {
            return "A";
        } else if (prefix == "Mr" && age > 40) {
            return "B";
        } else if (age > 20 && (prefix == "Mrs" || prefix == "Mr") && name.substring(0, 1) == "A") {
            return "C";
        } else {
            return "D";
        }
    }
}