package md.tekwill.classwork.equality;

import java.util.Objects;

public class Manager {
    private String name;
    private String department;

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Manager) {
            Manager other = (Manager) obj;
            return this.name != null
                    && this.name.equals(other.name)
                    && this.department != null
                    && this.department.equals(other.department);
        }
        return false;
    }
//      NEVER DO THIS, THIS IS A VERY BAD PRACTICE
//    public boolean equals(Object o) {
//        return true;
//    }

    @Override
    public int hashCode() {
//        int result = 1;
//        result = 31 * result + (name == null ? 0 : name.hashCode());
//        result = 31 * result + (department == null ? 0 : department.hashCode());
//        return result;
        // this is the same as above
        return Objects.hash(name, department);
    }
}
