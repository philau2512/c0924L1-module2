package service;

import controller.InvalidInputException;
import model.Contact;
import util.ReadAndWriteToCsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService implements IContactService {
    private final String CONTACTS_FILE = "D:\\Admin\\Documents\\IT_CODEGYM\\MODULE-2\\nop_bai_tap_module_2\\c0924L1-module2\\module2\\thi_cuoi_module_2\\src\\data\\contacts.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Contact> viewAllContact() {
        List<Contact> contacts = new ArrayList<>();
        List<String> contactList = ReadAndWriteToCsv.ReadFromCsv(CONTACTS_FILE);

        for (String contactString : contactList) {
            String[] contactArray = contactString.split(",");
            contacts.add(new Contact(contactArray[0], contactArray[1], contactArray[2], contactArray[3], contactArray[4], contactArray[5], contactArray[6]));
        }
        return contacts;
    }

    @Override
    public Contact getContactByPhone(String phone) {
        List<Contact> contacts = viewAllContact();
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phone)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public void addNewContact(Contact contact) {
        List<String> contactsList = new ArrayList<>();
        contactsList.add(contact.getInfoContact());
        ReadAndWriteToCsv.WriteToCsv(CONTACTS_FILE, contactsList, APPEND);
    }

    @Override
    public boolean deleteContactByPhone(String phone) {
        List<Contact> contactsList = viewAllContact();
        boolean isExist = false;
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getPhoneNumber().equals(phone)) {
                isExist = true;
                contactsList.remove(i);
                break;
            }
        }
        if (isExist) {
            List<String> contactStringList = new ArrayList<>();
            for (Contact contact : contactsList) {
                contactStringList.add(contact.getInfoContact());
            }
            ReadAndWriteToCsv.WriteToCsv(CONTACTS_FILE, contactStringList, NOT_APPEND);
        }
        return isExist;
    }

    @Override
    public boolean updateContactByPhone(String phone) {
        List<Contact> contactsList = viewAllContact();
        boolean isUpdate = false;
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getPhoneNumber().equals(phone)) {
                System.out.println("Sản phẩm cần update: " + contactsList.get(i));
                contactsList.remove(i);
                Scanner sc = new Scanner(System.in);

                System.out.print("Nhập nhóm mới cho sản phẩm: ");
                String group = sc.nextLine();
                System.out.print("Nhập tên mới: ");
                String name = sc.nextLine();
                System.out.print("Nhập giới tính mới: ");
                String gender = sc.nextLine();
                System.out.print("Nhập địa chỉ mới: ");
                String address = sc.nextLine();
                System.out.print("Nhập ngày sinh mới: ");
                String birthday = sc.nextLine();
                System.out.print("Nhập email mới: ");
                String email = sc.nextLine();
                if (!email.matches("^[a-zA-Z0-9_]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})$")) {
                    throw new InvalidInputException("Email invalid !");
                }

                contactsList.add(i, new Contact(phone, group, name, gender, address, birthday, email));
                isUpdate = true;
                break;
            }
        }
        if (isUpdate) {
            List<String> contactStringList = new ArrayList<>();
            for (Contact contact : contactsList) {
                contactStringList.add(contact.getInfoContact());
            }
            ReadAndWriteToCsv.WriteToCsv(CONTACTS_FILE, contactStringList, NOT_APPEND);
        }
        return isUpdate;
    }

    @Override
    public void readFromFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cảnh báo: Thao tác này sẽ ghi đè toàn bộ bộ nhớ hiện tại. Bạn có chắc chắn không? (Y/N)");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            List<Contact> contactsFromFile = viewAllContact();
            System.out.println("Đọc dữ liệu từ file thành công:");
            for (Contact contact : contactsFromFile) {
                System.out.println(contact);
            }
        } else {
            System.out.println("Hủy thao tác đọc từ file.");
        }
    }

    @Override
    public void writeToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cảnh báo: Thao tác này sẽ ghi đè toàn bộ file. Bạn có chắc chắn không? (Y/N)");
        String confirmWrite = scanner.nextLine();
        if (confirmWrite.equalsIgnoreCase("Y")) {
            List<Contact> contactsToWrite = viewAllContact();
            List<String> contactStringList = new ArrayList<>();
            for (Contact contact : contactsToWrite) {
                contactStringList.add(contact.getInfoContact());
            }
            ReadAndWriteToCsv.WriteToCsv(CONTACTS_FILE, contactStringList, false);
            System.out.println("Dữ liệu đã được ghi vào file.");
        } else {
            System.out.println("Hủy thao tác ghi vào file.");
        }
    }

    @Override
    public void findContact() {
        List<Contact> contactsList = viewAllContact();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập từ khóa tìm kiếm (số điện thoại hoặc tên): ");
        String keyword = scanner.nextLine().toLowerCase();

        List<Contact> results = new ArrayList<>();
        for (Contact contact : contactsList) {
            if (contact.getPhoneNumber().contains(keyword) || contact.getContactName().toLowerCase().contains(keyword)) {
                results.add(contact);
            }
        }

        if (results.isEmpty()) {
            System.out.println("Không tìm thấy liên hệ phù hợp với từ khóa: " + keyword);
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (Contact contact : results) {
                System.out.println(contact);
            }
        }
    }

}
