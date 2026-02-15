import java.io.*;

class Document {
    StringBuilder doc = new StringBuilder();

    void add(String text) {
        doc.append(text);
    }

    void replace(int s, int e, String text) {
        doc.replace(s, e, text);
    }

    void search(String word) {
        int index = doc.indexOf(word);
        if (index != -1)
            System.out.println("Found at index: " + index);
        else
            System.out.println("Not Found");
    }

    void extract(int s, int e) {
        System.out.println("Extracted: " + doc.substring(s, e));
    }

    void memory() {
        System.out.println("Length: " + doc.length());
        System.out.println("Capacity: " + doc.capacity());
    }

    void show() {
        System.out.println("Final Document: " + doc.toString());
    }
}

class Code11 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Document d = new Document();

        System.out.println("Enter initial text:");
        d.add(br.readLine());

        System.out.println("Enter text to add:");
        d.add(br.readLine());

        System.out.println("Enter word to search:");
        d.search(br.readLine());

        System.out.println("Enter start and end index to extract:");
        int s = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        d.extract(s, e);

        d.memory();
        d.show();
    }
}
