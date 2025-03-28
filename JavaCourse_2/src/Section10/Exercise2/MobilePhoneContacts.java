package Section10.Exercise2;

public class MobilePhoneContacts {
    public static void main(String[] args) {

//        ArrayList<Contact> cArr = new ArrayList<>();

        Contact c1 = Contact.createContact("Philip1", "000.001");
        Contact c2 = Contact.createContact("Philip2", "000.002");
        Contact c3 = Contact.createContact("Philip3", "000.003");
        Contact c4 = Contact.createContact("Philip4", "000.004");
        Contact c5 = Contact.createContact("Philip5", "000.005");
//        cArr.add(c1); cArr.add(c2); cArr.add(c3); cArr.add(c4); cArr.add(c5);
//        MobilePhone mb1 = new MobilePhone("999.999", cArr);


        MobilePhone mb1 = new MobilePhone("999.999");
        mb1.printContacts();
        mb1.addNewContact(c1);
        mb1.addNewContact(c2);
        mb1.printContacts();
        Contact c6 = Contact.createContact("Adela", "000.006");
        mb1.updateContact(c1, c2);
        mb1.printContacts();


    }
}
