class Code9 {

    public static void main(String[] args) {

        String s1 = " Hello World ";
        String s2 = "hello world";

        System.out.println("charAt: " + s1.charAt(1));
        System.out.println("compareTo: " + s1.compareTo(s2));
        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));
        System.out.println("indexOf: " + s1.indexOf("World"));
        System.out.println("length: " + s1.length());
        System.out.println("substring: " + s1.substring(1, 6));
        System.out.println("toLowerCase: " + s1.toLowerCase());
        System.out.println("toUpperCase: " + s1.toUpperCase());
        System.out.println("trim: '" + s1.trim() + "'");
        System.out.println("toString: " + s1.toString());
        
        System.out.print("toCharArray: ");
        for (char c : s1.toCharArray())
            System.out.print(c + " ");
        System.out.println();

        System.out.println("valueOf: " + String.valueOf(50));

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");

        System.out.println("Mutable String: " + sb);
    }
}
