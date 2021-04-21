package md.tekwill.classwork.scopes;

public class GetterSetterExample {

    private int num;

    public void setNum(int num) {
        if (num > 100) {
            throw new RuntimeException();
        }
        this.num = num;
    }

    public void changePhoneNumber(Phone phone) {

        phone = new Phone();
        phone.setPhoneNumber(11111111);
    }

    public int getNum() {
        return num;
    }
}
