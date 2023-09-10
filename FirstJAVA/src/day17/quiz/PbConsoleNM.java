package day17.quiz;

import java.util.*;

public class PbConsoleNM {
    static Map<String, Map<Integer, String>> phoneBook = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("==== What to do ====");
            System.out.println("1. New Group");
            System.out.println("2. Print");
            System.out.println("3. New Address");
            System.out.println("4. Find Phone");
            System.out.println("5. Find Name");
            System.out.println("6. Exit");
            System.out.print("> ");
            int behavior = sc.nextInt();
            sc.nextLine();

            switch (behavior) {
                case 1:
                    doNewGroup();
                    break;
                case 2:
                    printAll();
                    break;
                case 3:
                    doNewAddress();
                    break;
                case 4:
                    findPhoneNumber();
                    break;
                case 5:
                    findName();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }

    public static void doNewGroup() {
        System.out.print("Group name: ");
        String groupName = sc.nextLine();
        if (!phoneBook.containsKey(groupName)) {
            phoneBook.put(groupName, new HashMap<>());
            System.out.println("Group '" + groupName + "' created.");
        } else {
            System.out.println("Group already exists.");
        }
    }

    public static void printAll() {
        for (Map.Entry<String, Map<Integer, String>> groupEntry : phoneBook.entrySet()) {
            String groupName = groupEntry.getKey();
            Map<Integer, String> group = groupEntry.getValue();
            System.out.println("Group: " + groupName);
            for (Map.Entry<Integer, String> entry : group.entrySet()) {
                int phoneNumber = entry.getKey();
                String name = entry.getValue();
                System.out.println("Phone Number: " + phoneNumber + ", Name: " + name);
            }
        }
    }

    public static void doNewAddress() {
        System.out.print("Enter group name: ");
        String groupName = sc.nextLine();
        if (phoneBook.containsKey(groupName)) {
            System.out.print("Phone number: ");
            int phoneNumber = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = sc.nextLine();

            Map<Integer, String> group = phoneBook.get(groupName);
            if (!group.containsKey(phoneNumber)) {
                group.put(phoneNumber, name);
                System.out.println("Address added to group '" + groupName + "'.");
            } else {
                System.out.println("Phone number already exists in the group.");
            }
        } else {
            System.out.println("Group does not exist.");
        }
    }

    public static void findPhoneNumber() {
        System.out.print("Enter partial phone number: ");
        String partialPhoneNumber = sc.nextLine();

        for (Map.Entry<String, Map<Integer, String>> groupEntry : phoneBook.entrySet()) {
            Map<Integer, String> group = groupEntry.getValue();
            for (Map.Entry<Integer, String> entry : group.entrySet()) {
                int phoneNumber = entry.getKey();
                if (String.valueOf(phoneNumber).contains(partialPhoneNumber)) {
                    String groupName = groupEntry.getKey();
                    String name = entry.getValue();
                    System.out.println("Group: " + groupName + ", Phone Number: " + phoneNumber + ", Name: " + name);
                }
            }
        }
    }

    public static void findName() {
        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        for (Map.Entry<String, Map<Integer, String>> groupEntry : phoneBook.entrySet()) {
            Map<Integer, String> group = groupEntry.getValue();
            for (Map.Entry<Integer, String> entry : group.entrySet()) {
                String name = entry.getValue();
                if (name.equalsIgnoreCase(searchName)) {
                    String groupName = groupEntry.getKey();
                    int phoneNumber = entry.getKey();
                    System.out.println("Group: " + groupName + ", Phone Number: " + phoneNumber);
                }
            }
        }
    }
}
