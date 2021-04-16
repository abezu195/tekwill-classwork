package md.tekwill.classwork.modifiers.access;

public class DefaultBook {
    int issueCount;
    void issueHistory() {}

    private String type = "defaultBook";
    protected String protectedType = "protectedDefaultBook";
    String packagePrivateType = "packagePrivateDefaultBook";
    public String publicPrivateType = "publicDefaultBook";

    private void displayType() {
        System.out.println(type);
    }
    public void displayTypePublic() {
        System.out.println(type);
    }
    protected void displayTypeProtected() {
        System.out.println(type);
    }
    void displayTypePackagePrivate() {
        System.out.println(type);
    }
}
