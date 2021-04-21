package md.tekwill.classwork.scopes;

public class Phone {
    static boolean softKeyboard = true;
    private int phoneNumber;

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
