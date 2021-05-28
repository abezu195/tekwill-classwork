package md.tekwill.classwork.casting;

public class SuperProfessor extends Professor implements PianoTeachable, GuitarTeachable {


    public SuperProfessor(String name) {
        super(name);
    }

    @Override
    public void teachGuitar() {
        System.out.println("Teaching you how to play GUITAR!");
    }

    @Override
    public void teachPiano() {
        System.out.println("Teaching you how to play PIANO!");
    }
}
