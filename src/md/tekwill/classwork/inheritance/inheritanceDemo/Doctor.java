package md.tekwill.classwork.inheritance.inheritanceDemo;

import md.tekwill.classwork.inheritance.Employee;

public class Doctor extends Employee {

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
//      won't compile since phone number is a package-private field in Employee class, and Doctor class is in a different package
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
}
