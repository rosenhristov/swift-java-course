package task1urlvalidator;

import java.util.regex.*;

/**
 * Created by Rossen on 10.4.2016 г..
 */
/*
    Задача 1:
    Напишете програма, която приема URL адрес във формат: [protocol]://[server]/[resource] и извлича от него протокол,
    сървър и ресурс. Например, при подаден адрес:  http://swift.bg/courses/java/index.php резултатът е:
    protocol="http"
    server=“swift.bg"
    resource="/courses/java/index.php“

*/
public class RegExURLValidator {
    public static void main(String[] args) {
        String url = "http://swift.bg/courses/java/index.php";
        String protocolRegEx = "\\b[a-z]{3,5}"; //http
        String serverRegEx = "[\\w.bg]+";// swift.bg    [a-z]+.[bg]+ ; ([a-z]+\.)+bg
        String resourceRegEx = "[/]{1}[c?][(/\\w.)]+$";// /courses/java/index.php

        Pattern protocolPattern = Pattern.compile(protocolRegEx);
        Pattern serverPattern = Pattern.compile(serverRegEx);
        Pattern resourcePattern = Pattern.compile(resourceRegEx);
        Matcher protocolMatcher = protocolPattern.matcher(url);
        Matcher serverMatcher = serverPattern.matcher(url);
        Matcher resourceMatcher = protocolPattern.matcher(url);
        System.out.println("ProtocolPattern matches protocol \"http\"?: " + protocolMatcher.lookingAt());//true
        System.out.println("ServerPattern matches server \"swift.bg\"?: " + serverMatcher.lookingAt());//tre
        System.out.println("ResourcePattern matches resource \"/courses/java/index.php\"?: "
                + resourceMatcher.lookingAt());//true
    }
}
