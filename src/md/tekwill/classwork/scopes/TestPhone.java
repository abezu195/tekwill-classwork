package md.tekwill.classwork.scopes;

public class TestPhone {
    public static void main(String[] args) {
        Phone.softKeyboard = false;
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        System.out.println(p1.softKeyboard);
        System.out.println(p2.softKeyboard);
        p1.softKeyboard = true;
        System.out.println(p1.softKeyboard);
        System.out.println(p2.softKeyboard);
        System.out.println(Phone.softKeyboard);

        String newPhoneNumber = "0037368171453";
        if (newPhoneNumber.contains(Phone.MD_PHONE_NUMBER_CODE)) {
            Phone mdPhone = new Phone(newPhoneNumber);
        }
    }
}
