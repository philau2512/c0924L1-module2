package service;

import model.Contact;

import java.util.List;

public interface IContactService {
    List<Contact> viewAllContact();
    Contact getContactByPhone(String phone);
    void findContact();
    void addNewContact(Contact contact);
    boolean deleteContactByPhone(String phone);
    boolean updateContactByPhone(String phone);
    void readFromFile();
    void writeToFile();
}
