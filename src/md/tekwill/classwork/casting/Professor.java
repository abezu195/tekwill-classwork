package md.tekwill.classwork.casting;

public abstract class Professor {

    private final String name;

    protected Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Professor { name=\"" + name + "\" }";
    }
}
