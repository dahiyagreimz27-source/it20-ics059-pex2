/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlinkedlist;
import studentlinkedlist.StudentLinkedList;
import java.util.Scanner;

public class MainStudentLinked {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        System.out.print("How many student IDs do you want to add? ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter ID #" + i + ": ");
            int id = scanner.nextInt();
            list.append(id);
        }

        System.out.print("\nInitial List:\n");
        list.display();

        System.out.print("\nEnter a student ID to add at the front: ");
        int firstId = scanner.nextInt();
        list.addFirst(firstId);

        System.out.print("List after inserting " + firstId + " at front:\n");
        list.display();

        System.out.print("\nEnter a student ID to search for: ");
        int searchValue = scanner.nextInt();
        boolean found = list.search(searchValue);
        System.out.println("Searching for " + searchValue + ": " + (found ? "Found" : "Not Found"));

        System.out.print("\nEnter a student ID to delete: ");
        int deleteValue = scanner.nextInt();
        list.delete(deleteValue);

        System.out.print("List after deleting " + deleteValue + ":\n");
        list.display();

        scanner.close();
    }
}