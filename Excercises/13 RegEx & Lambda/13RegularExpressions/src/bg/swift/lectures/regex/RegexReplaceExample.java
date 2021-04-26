package bg.swift.lectures.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegexReplaceExample.java
 * Version: 1.0
 * Date: 3/10/16
 * Created by: Haemimont AD, (http://www.haemimont.com)
 */
public class RegexReplaceExample {

    public static void main(String[] args) {
        final String REGEX = "dog";
        final String REPLACE = "cat";
        String INPUT = "The dog says meow. All dogs say meow.";

        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);

        System.out.println(INPUT);
    }
}
