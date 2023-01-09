package revision;

/*
Triedam vypíše nasledujúci text, pričom používateľ môže meniť hodnoty cez premenné
Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania
ako Java programátor.

V Bratislave dňa 18.06.2022
 */
public class VariableExamplesUserImput {
    public static void main(String[] args) {
        String text1 = "Študent Jozef Mrkvička sa narodil";
        String date = " 03.04.2000";
        String text2 = " ,z maturitnej skúšky má známku ";
        float grade = 1.5f;
        String gradeWithComma = String.format("%.1f",grade);
        String text3 = " a od septembra ";
        int year = 2022;
        String text4 = " nastúpi do nového zamestnania ako programátor.\n";
        String text5 = "\tV Bratislave dňa ";
        String currentDate = "18.06.2022";

        String wholeText = text1 + date + text2 + gradeWithComma + text3 + year + text4 + text5 + currentDate;
        System.out.println(wholeText);



        //Locale locale = new Locale("sk", "SR");
        //DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        //String date = dateFormat.format(new Date());
        //System.out.print(date);

        //String today= DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now());


    }
}
