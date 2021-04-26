package bg.swift.lectures.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegexGroupsExample.java
 * Version: 1.0
 * Date: 3/10/16
 * Created by: Haemimont AD, (http://www.haemimont.com)
 */
public class RegexGroupsExample {

    // http://stackoverflow.com/questions/18675870/expected-outcome-in-group-capture
    public static void main(String[] args) {
        String line = "This order was placed for QT3000! OK?";
        //Pattern pattern = Pattern.compile("(.*?)(\\d+)(.*)");
         Pattern pattern = Pattern.compile("(.*)(\\d+)(.*)");

        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println("group 1: " + matcher.group(1));
            System.out.println("group 2: " + matcher.group(2));
            System.out.println("group 3: " + matcher.group(3));
        }
    }
}
