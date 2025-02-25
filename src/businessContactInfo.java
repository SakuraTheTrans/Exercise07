public class businessContactInfo extends contactInfo{
    private String phoneNum;

    public businessContactInfo(String name, String email, String phoneNum) {
        super(name, email);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public void displayContact() {
        System.out.println("Name : " + this.getName() + "\nEmail : " + this.getEmail() + "\nPhone : " + this.getPhoneNum() + "\n");
    }
}
