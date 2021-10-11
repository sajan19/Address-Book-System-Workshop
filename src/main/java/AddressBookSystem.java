public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System...");
        //Create an Object
        Contacts contact = new Contacts();
        contact.setFirstName("sajan");
        contact.setLastName("mhatre");
        contact.setCity("vashi");
        contact.setState("goa");
        contact.setZip("500876");
        contact.setPhoneNumber("9988663344");
        contact.setEmail("sajanm66@gmail.com");
        System.out.println("Contact details: " + contact.getFirstName() + " " + contact.getLastName() + " " + contact.getCity() + " " +
                contact.getState() + " " + contact.getZip() + " " + contact.getPhoneNumber() + " " + contact.getEmail());
        System.out.println("Thank for Using Address book");
    }
}
