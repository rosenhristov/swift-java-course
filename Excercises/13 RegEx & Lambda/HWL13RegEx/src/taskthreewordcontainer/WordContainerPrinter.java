package taskthreewordcontainer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rossen on 14.4.2016 г..
 */
/*
    Задача 3: Напишете програма, която претърсва даден текст за дадена дума и намира и отпечатва всички изречения, в
    които тази дума се среща. Можете да считате, че всяко срещане на някой от символите ".", "!" и "?" означава край на
    изречение.
*/
public class WordContainerPrinter {
    public static void main(String[] args) {
        File textSource = new File("E:\\codezone\\swiftjavacourse\\JavaCourseHomework\\L13RegEx\\src\\" +
                "taskthreewordcontainer\\TextSource.txt");
        Scanner reader = null;//Scanner object that reads the file
        String line = null;//holds the cuurent line read by the reader
        String emailRegEx = "[\\d\\(\\)\\w,-]*([J][e][n]{2}[i][f][e][r][,\\s-])+[\\w\\d,\\s-]*[.!?]{1}";//regex matching e-mail addresses ([J][e][n]{2}[i][f][e][r])+
        Pattern wordPattern = Pattern.compile(emailRegEx);
        Matcher wordMatcher = null;
        String sentence = null; //holds the current found sentence address that has to be printed

        try {
            reader = new Scanner(textSource);//scans file text.txt
            System.out.println("\nList of sentences, containing the word \"Jennifer\":\n");
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                wordMatcher = wordPattern.matcher(line);
                while (wordMatcher.find()) {
                    sentence = line.substring(wordMatcher.start(), wordMatcher.end());
                    System.out.println(sentence);
                }
            }
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
