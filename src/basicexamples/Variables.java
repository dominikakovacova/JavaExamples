package basicexamples;

public class Variables {
    public static void main(String[] args) {
        String name = "John";
        System.out.println (name);

/*        int myNum = 15;
        System.out.println (myNum);*/

        int myNum;
        myNum = 15;
        System.out.println(myNum);
        // premenne sa odporuca davat na zaciatok pod main, sout-y dat dokopy pre citatelnost

        final double conversionRate = 30.126;
        System.out.println(conversionRate);
        System.out.println("konverzný kurz EUR / SK je " + conversionRate + " ku dňu 21.12.2022"); //takto sa dá pridávať text aj do iných sout-ov
               // conversionRate = 24.125; final už sa nedá prepisat, nezoberie ho

        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);

        char myLetter = 'D'; //AltGr + p sú apostrofy ''
        System.out.println(myLetter);

        boolean myBool = true;
        System.out.println(myBool);

        String myText = "Hello";
        System.out.println(myText);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName; // spojí obsah dvoch premenných a to first name a last name a výsledkom je premenná fullname
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println("výsledok súčtu je " + (x + y)); // sčíta hodnoty premenných x a y, cize vysledok bude 11

        int a = 5, b = 6, c = 50;
        System.out.println("Výsledok sčítania 3 premenných, kde " + "a je " + a + ", b je " + b + ", c je "+ c + ", je: " + (a + b + c));
        // The differences between the Integer and String objects in Java are: Integer can be converted to String, but String cannot be converted to Integer. Integer is a numeric value, while String is a character value represented in quotes.

    }
}
