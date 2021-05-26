package md.tekwill.classwork.interfaces.extension;

public class FooImplementation implements DerivedInterface {

    @Override
    public String getFoo() {
        return "foo!";
    }

    @Override
    public String getBar() {
        return "bar!";
    }
}
