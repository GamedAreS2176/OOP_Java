import java.util.Scanner;

class Code11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial text: ");
        StringBuffer text = new StringBuffer(sc.nextLine());

        System.out.println("\nCurrent Text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Capacity: " + text.capacity());

        System.out.print("\nEnter text to append: ");
        text.append(sc.nextLine());
        System.out.println("After Appending: " + text);

        System.out.print("\nEnter index to view character: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index >= 0 && index < text.length()) {
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } else {
            System.out.println("Invalid index!");
        }

        System.out.print("\nEnter position to insert text: ");
        int pos = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter text to insert: ");
        String insertText = sc.nextLine();

        if (pos >= 0 && pos <= text.length()) {
            text.insert(pos, insertText);
            System.out.println("After Insertion: " + text);
        } else {
            System.out.println("Invalid position!");
        }

        System.out.print("\nEnter word/sequence to search: ");
        String search = sc.nextLine();
        int foundAt = text.indexOf(search);

        if (foundAt != -1) {
            System.out.println("Found at position: " + foundAt);
        } else {
            System.out.println("Not found in the text.");
        }

        sc.close();
    }
}
