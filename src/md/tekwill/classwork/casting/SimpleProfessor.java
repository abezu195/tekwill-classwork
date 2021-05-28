package md.tekwill.classwork.casting;

public class SimpleProfessor extends Professor implements GuitarTeachable {

    protected SimpleProfessor(String name) {
        super(name);
    }

    @Override
    public void teachGuitar() {
        System.out.println("Teaching slowly how to play GUITAR!");
    }
}
