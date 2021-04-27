package md.tekwill.classwork.methods.zoooverload;

public class Zoo {

    public static void main(String[] args) {
        AnimalDoctor animalDoctor = new AnimalDoctor();

        Lion lion = new Lion();
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        animalDoctor.checkHealth(lion);
        animalDoctor.checkHealth(rabbit);
        animalDoctor.checkHealth(tiger);

        ZooKeeper zooKeeper = new ZooKeeper();
        animalDoctor.checkHealth(zooKeeper);
        //not the best way to do it, since the check health method accepts too many types of objects
        animalDoctor.checkHealth(1.0);
        animalDoctor.checkHealth(new String("some string"));
        animalDoctor.checkHealth(new char[]{'a', 'b', 'c'});
    }
}
