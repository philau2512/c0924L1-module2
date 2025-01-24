package controller;

import model.Contact;
import service.ContactService;

import java.util.List;
import java.util.Scanner;

public class ContactController {
    ContactService contactService = new ContactService();

    public void displayContactMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Danh sách các liên hệ");
                    List<Contact> contactList = contactService.viewAllContact();
                    for (Contact contact : contactList) {
                        System.out.println(contact);
                    }
                    break;
                case 2:
                    System.out.print("Nhập số điện thoại: ");
                    String phoneNumber = scanner.nextLine();
                    if (!phoneNumber.matches("\\d{10}")) {
                        throw new InvalidInputException("Số điện thoại không hợp lệ!");
                    }
                    System.out.print("Nhập nhóm: ");
                    String group = scanner.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String contactName = scanner.nextLine();
                    System.out.print("Nhập giới tính: ");
                    String gender = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String address = scanner.nextLine();
                    System.out.print("Nhập ngày sinh: ");
                    String birthday = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();
                    if (!email.matches("^[a-zA-Z0-9_]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})$")) {
                        throw new InvalidInputException("Email invalid!");
                    }
                    Contact newContact = new Contact(phoneNumber, group, contactName, gender, address, birthday, email);
                    contactService.addNewContact(newContact);
                    break;
                case 3:
                    System.out.print("Nhập số phone của danh bạ cần chỉnh sửa: ");
                    String phoneToUpdate = scanner.nextLine();
                    if (!phoneToUpdate.matches("\\d{10}")) {
                        throw new InvalidInputException("Số điện thoại không hợp lệ!");
                    }
                    boolean isUpdated = contactService.updateContactByPhone(phoneToUpdate);
                    if (isUpdated) {
                        System.out.println("✅ Cập nhật danh bạ có phone: " + phoneToUpdate + " thành công");
                    } else {
                        throw new ContactNotFoundException("❌ Không tìm được danh bạ với số điện thoại trên.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập số phone của danh bạ cần xóa: ");
                    String phoneNumberToDelete = scanner.nextLine();
                    if (!phoneNumberToDelete.matches("\\d{10}")) {
                        throw new InvalidInputException("Số điện thoại không hợp lệ!");
                    }
                    boolean isDeleted = contactService.deleteContactByPhone(phoneNumberToDelete);
                    if (isDeleted) {
                        System.out.println("✅ Xóa danh bạ có phone: " + phoneNumberToDelete + " thành công");
                    } else {
                        throw new ContactNotFoundException("❌ Không tìm được danh bạ với số điện thoại trên.");
                    }
                    break;
                case 5:
                    contactService.findContact();
                    break;
                case 6:
                    contactService.readFromFile();
                    break;
                case 7:
                    contactService.writeToFile();
                break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ - Thoát chương trình.");
                    System.exit(0);
            }
        }
    }
}
