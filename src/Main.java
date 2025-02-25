public class Main {
    public static void main(String[] args) {
        ContactInfo person1 = new ContactInfo("Sakura", "sakurathetrans@gmail.com");
        BusinessContactInfo person2 = new BusinessContactInfo("Astra", "astracreatesthings@gmail.com","614-789-2234");

        person1.displayContact();
        person2.displayContact();
    }
}