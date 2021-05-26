package md.tekwill.classwork.referenceTypes;

import java.util.ArrayList;
import java.util.List;

public class HREmployee extends Employee implements Interviewer {

    private final List<String> specializations = new ArrayList<>();

    HREmployee(String firstName, String lastName, String specialization) {
        super(firstName, lastName);
        addSpecialization(specialization);
    }

    public void addSpecialization(String specialization) {
        if (!specializations.contains(specialization)) {
            specializations.add(specialization);
        }
    }

    public List<String> getSpecializations() {
        return new ArrayList<>(specializations);
    }

    @Override
    public void conductInterview() {
        System.out.println(getFirstName() + " is conducting an interview!");
    }
}
