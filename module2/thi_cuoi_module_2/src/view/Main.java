package view;

import controller.ContactController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactController contactController = new ContactController();
        contactController.displayContactMenu();
    }
}
