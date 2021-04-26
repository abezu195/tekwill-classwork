package md.tekwill.classwork.scopes;

public class Phone {

    public static final String MD_PHONE_NUMBER_CODE = "00373";
    public static final String DEFAULT_NUMBER_CODE = "0033";

    static boolean softKeyboard = true;
    private int phoneNumber;

    public Phone() {}

    public Phone(String newPhoneNumber) {
        if (newPhoneNumber.contains(MD_PHONE_NUMBER_CODE)) {
            this.phoneNumber = Integer.parseInt(newPhoneNumber);
        }
        throw new RuntimeException();
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        if (newPhoneNumber.contains(MD_PHONE_NUMBER_CODE)) {
            phoneNumber = Integer.parseInt(newPhoneNumber);
        }
    }

    public void myMethod() {
        boolean softKeyboard = true;
        if (softKeyboard == Phone.softKeyboard) {

        }

    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
