package bg.swift.lectures.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MatcherMethodsExample.java
 * Version: 1.0
 * Date: 3/10/16
 * Created by: Haemimont AD, (http://www.haemimont.com)
 */
public class MatcherMethodsExample {

    public static void matches() {

        String text = "This is the text to be searched for occurrences of the http:// pattern.";

        String patternString = ".*http://.*";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();
    }

    public static void lookingAt() {
        String text =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";

        String patternString = "This is the";

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("lookingAt = " + matcher.lookingAt());
        System.out.println("matches   = " + matcher.matches());

    }

    /**
     * find() + start() + end()
     */
    public static void findStartEnd() {
        String text =
                "This is the text which is to be searched " +
                        "for occurrences of the word 'is'.";

        String patternString = "is";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
            // matcher.reset()
        }
    }

    public static void group() {
        String text =
                "John writes about this, and John writes about that," +
                        " and John writes about everything. ";

        String patternString1 = "(John)";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("found: " + matcher.group(1));
        }

    }

    public static void groupMany() {
        String text =
                "John writes about this, and John Doe writes about that," +
                        " and John Wayne writes about everything.";

        String patternString1 = "(John) (.+?) ";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("found: " + matcher.group(1) +
                    " " + matcher.group(2));
        }
    }

    public static void groupInGroup() {
        String text =
                "John writes about this, and John Doe writes about that," +
                        " and John Wayne writes about everything.";

        String patternString1 = "((John) (.+?)) ";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("found: <" + matcher.group(1) +
                    "> <" + matcher.group(2) +
                    "> <" + matcher.group(3) + ">");
        }
    }

    public static void namedGroups() {
        String pattern = ";(?<groupOne>\\d{6});(?<groupTwo>\\d{6});";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(";123456;123456;");
        boolean success = matcher.find();

        String foo = success ? matcher.group("groupOne") : null;
        String bar = success ? matcher.group("groupTwo") : null;
    }

    /**
     * replaceAll() + replaceFirst()
     */
    public static void replaceAllAndReplaceFirst() {

        String text =
                "John writes about this, and John Doe writes about that," +
                        " and John Wayne writes about everything.";

        String patternString1 = "((John) (.+?)) ";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        String replaceAll = matcher.replaceAll("Joe Blocks ");
        System.out.println("replaceAll   = " + replaceAll);

        String replaceFirst = matcher.replaceFirst("Joe Blocks ");
        System.out.println("replaceFirst = " + replaceFirst);
    }
}
