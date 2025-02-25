public class Main {
    public static void main(String[] args) {
        // Write a program that includes a class representing contact information for a person
        // including their name and email address.
        //
        // This class should include a method for displaying the contact's name and email address.
        //
        // The program should also include a class for business contacts that extends the contact class
        // and stores the contact's phone number.
        //
        // The business contact class should override the base class's method that displays
        // the name and email address so that it displays the phone number in addition.
        //
        // Create instances of both classes to demonstrate functionality.

        contactInfo person1 = new contactInfo("Sakura", "sakurathetrans@gmail.com");
        businessContactInfo person2 = new businessContactInfo("Astra", "astracreatesthings@gmail.com","614-789-2234");

        person1.displayContact();
        person2.displayContact();
    }
}