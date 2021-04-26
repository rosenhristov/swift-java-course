package task2regexemailextractor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rossen on 12.4.2016 г..
 */
/*
    Задача 2:
    Напишете програма, която изважда от даден текстов документ всички поднизове, които приличат на email адрес
    (последователности от символи във формат <identifier>@<host>). Използвайте подходящ рег. израз.
*/
public class RegexEmailExtractor {
    public static void main(String[] args) {
        File text = new File("E:\\codezone\\swiftjavacourse\\JavaCourseHomework\\L13RegEx\\src\\" +
                "task2regexemailextractor\\text.txt");
        Scanner reader = null;//Scanner object that reads the file
        String line = null;//holds the cuurent line read by the reader
        String emailRegEx = "[\\w\\d\\.]+[@][\\w]+[\\.]{1}[\\w]+";//regex matching e-mail addresses
        Pattern emailPattern = Pattern.compile(emailRegEx);
        Matcher emailMatcher = null;
        String email = null; //holds the current found e-mail address that has to be printed
        int emailCounter = 0;

        try {
            reader = new Scanner(text);//scans file text.txt
            System.out.println("LIST OF E-MAILS:\n");
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                emailMatcher = emailPattern.matcher(line);
                while (emailMatcher.find()) {
                    email = line.substring(emailMatcher.start(), emailMatcher.end());
                    System.out.println(email);
                    emailCounter++;
                }
            }
            System.out.printf("%n%d E-MAILS WERE FOUND IN THIS TEXT.%n", emailCounter);
        } catch (FileNotFoundException e) {
            System.out.println("Some problems with the file occurred." +
                    "Please, check if the file exists and its path is entered correctly");
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
