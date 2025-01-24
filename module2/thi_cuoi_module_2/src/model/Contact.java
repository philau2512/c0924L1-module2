package model;

public class Contact {
    private String phoneNumber;
    private String group;
    private String contactName;
    private String gender;
    private String address;
    private String birthday;
    private String email;

    public Contact() {
    }

    public Contact(String phoneNumber, String group, String contactName, String gender, String address, String birthday, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.contactName = contactName;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInfoContact(){
        return this.phoneNumber + ',' + this.group + ',' + this.contactName + ',' + this.gender + ',' + this.address + ',' + this.birthday + ',' + this.email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber=" + phoneNumber +
                ", group=" + group +
                ", contactName='" + contactName + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
