class Code10 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        System.out.println("append: " + sb);
        System.out.println("capacity: " + sb.capacity());
        System.out.println("charAt(1): " + sb.charAt(1));
        sb.delete(4, 9);
        System.out.println("delete: " + sb);
        sb.deleteCharAt(0);
        System.out.println("deleteCharAt: " + sb);
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity: " + sb.capacity());
        char[] ch = new char[5];
        sb.getChars(0, 5, ch, 0);
        System.out.print("getChars: ");
        for (char c : ch)
            System.out.print(c + " ");
        System.out.println();
        System.out.println("indexOf(\"a\"): " + sb.indexOf("a"));
        sb.insert(0, "Core ");
        System.out.println("insert: " + sb);
        System.out.println("length: " + sb.length());
        sb.setCharAt(0, 'c');
        System.out.println("setCharAt: " + sb);
        sb.setLength(4);
        System.out.println("setLength: " + sb);
        System.out.println("substring: " + sb.substring(0, 2));
        String str = sb.toString();
        System.out.println("toString: " + str);
    }
}
