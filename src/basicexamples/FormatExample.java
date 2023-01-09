package basicexamples;

public class FormatExample {
        public static void main(String[] args) {
            String name = "sonoo";
            String sf1 = String.format("name is %s", name);
            String sf2 = String.format("value is %f", 32.33434);
            String sf3 = String.format("value is %12.20f", 12.33434);//returns 12 char fractional part filling with 0

            System.out.println(sf1);
            System.out.println(sf2);
            System.out.println(sf3);

            System.out.println(); // empty line in console
            String str1 = String.format("Decimal number is %d", 101); // Integer value
            String str2 = String.format("%s", "Amar Singh"); // String value
            String str3 = String.format("%f", 101.00);       // Float value
            String str4 = String.format("%x", 101);          // Hexadecimal value
            String str5 = String.format("%c", 'c');          // Char value
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str4);
            System.out.println(str5);

            System.out.printf("Hello %s!%n", "World");
            System.out.println("Test - is it next line?");
            System.out.printf("baeldung%nline%nterminator");

            System.out.printf("%n%n"); // 2 empty lines

            System.out.printf("%b%n", null);
            System.out.printf("%B%n", false);
            System.out.printf("%B%n", 5.3);
            System.out.printf("%b%n", "random text");

            float number = 1.234f;
            System.out.printf("Number rounded to 2 decimal places %.2f", number);

        }
}