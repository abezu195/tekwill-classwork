package md.tekwill.classwork.interfaces.extension;

public interface DerivedInterface extends BaseInterfaceBar, BaseInterfaceFoo {

    String getBar();

    default String getAlpha() {
        return "alpha!";
    }

    // In order to inherit from 2 interfaces with default same method signature, we need to override 'em
    @Override
    default void setFoo() {

    }
}
