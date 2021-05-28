package md.tekwill.classwork.casting;

import java.util.ArrayList;
import java.util.List;

public class CastingDemo {

    public static void main(String[] args) {
        GuitarTeachable michael = new SuperProfessor("Michael");
        GuitarTeachable joshua = new SimpleProfessor("Joshua");
        GuitarTeachable guitarFan = new GuitarFan();

        List<GuitarTeachable> teachers = new ArrayList<>();
        teachers.add(michael);
        teachers.add(joshua);
        teachers.add(guitarFan);

        for (GuitarTeachable teacher : teachers) {
            if (teacher instanceof Professor) {
                Professor professor = (Professor) teacher;
                System.out.println("Professor said: My name is " + professor.getName());
            }
            if (teacher instanceof PianoTeachable) {
                System.out.println("I would like some extra piano lessons! Teach me!");
                PianoTeachable pianoTeacher = (PianoTeachable) teacher;
                pianoTeacher.teachPiano();
//                ((PianoTeachable) teacher).teachPiano(); same as above, but in a shorter manner (single liner!)
            }
            teacher.teachGuitar();
            System.out.println();
        }

        // DONT CAST if you're not sure that the type is a sub-type
//        Professor professor = (Professor) guitarFan; //throws java.lang.ClassCastException! Program is interrupted!
//        System.out.println("Guitar fan's name as Professor class is " + professor.getName());

        if (guitarFan instanceof Professor) {
            Professor professor = (Professor) guitarFan;
            System.out.println("Guitar fan's name as Professor class is " + professor.getName());
        }
    }
}
