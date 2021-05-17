package md.tekwill.classwork.arraylists;

public final class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return name != null && name.equals(other.getName());
        } else {
            return false;
        }
    }
}
