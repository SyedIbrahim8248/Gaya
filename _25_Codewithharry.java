package Booksolutionjava.java;

public class _25_Codewithharry {
    public static void main(String[] args) {
        //wap to conver  string to lewr case
        String name = "IBRAHIM";
        name = name.toLowerCase();
        System.out.println(name);
        //wap to replace spaces with underscores
        String text  = "To Lower Case";
        text = text.replaceAll(" ", "_");
        System.out.println(text);
        //wap a java  to fill ina letter template which looks below
        //letter = "Dear <|name|>, Thanks a lot"
        //relpace <|name|> with a string (name)
        String letter = "Dear <|name>, Thanks a lot";
        letter = letter.replaceAll("<|name|> ", " Ibrahim_");
        System.out.println(letter);
        //wap a java to detect double and triple spaces in a string
        String  myString = "This string contains  double and triple spaces";
        System.out.println(myString);
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        //wap to format the follwing letter using escape sequence characters
        //letter = "Dera harry, This Java Course is nice Thanks
        String myLetter = "Dear Harry, \n\t This Java Corse is Nice.\n\tThanks";
        System.out.println(myLetter);

    }
}
