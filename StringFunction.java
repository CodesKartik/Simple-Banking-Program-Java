
public class StringFunction {

    public static void main(String[] args) {

        String str = "HELLO! JAVA";
        System.out.println("original string: " + str);

        //common strings methos
        System.out.println("Length: " + str.length());
        System.out.println("Charater at index 1: " + str.charAt(1));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Contains java: " + str.contains("JAVA"));
        System.out.println("Starts with Hello: " + str.startsWith("HELLO"));
        System.out.println("Ends with JAVA: " + str.endsWith("JAVA"));
        System.out.println("Substring : " + str.substring(0));

        StringBuilder builder = new StringBuilder("Hello");
        builder.append("JAVA");
        builder.insert(5, ",");
        System.out.println(builder.toString());

        StringBuffer buffer = new StringBuffer("HELLO");
        buffer.append(" JAVA");
        System.out.println(buffer.toString());

    }

}
