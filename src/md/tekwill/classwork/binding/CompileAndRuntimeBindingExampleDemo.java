package md.tekwill.classwork.binding;

public class CompileAndRuntimeBindingExampleDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee prg = new Programmer(); //

        System.out.println(emp.name); // displays "Employee"
        System.out.println(prg.name); // displays "Employee" | this will print out value of name from class Employee, because of compile time binding!

        emp.printName(); //displays "Employee"
        prg.printName(); //displays "Programmer" | this will print out value of name from class Programmer, because of runtime binding, which means the lowest in hierachy method will be called!

        System.out.println(emp.getName()); // "Employee"
        System.out.println(prg.getName()); // "Programmer"
    }
}
