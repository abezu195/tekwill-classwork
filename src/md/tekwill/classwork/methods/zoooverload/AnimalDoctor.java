package md.tekwill.classwork.methods.zoooverload;

public class AnimalDoctor {

    public void checkHealth(Lion lion) {
        System.out.println("Checking health for Lion! This is pretty dangerous! " + lion);
    }

    void checkHealth(Rabbit rabbit) {
        System.out.println("Checking health for a bunny! He's sweeet! " + rabbit);
    }

    String checkHealth(Tiger tiger) {
        System.out.println("Checking health for a tiger! " + tiger);
        return "Rawr!";
    }

    //not the best practice to provide implementation with Object as input param! Opens up the gate for too many possible variants
    void checkHealth(Object obj) {
        System.out.println("This is a health check for anyone! " + obj);
    }
}
