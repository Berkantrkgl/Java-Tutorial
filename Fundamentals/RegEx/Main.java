package Fundamentals.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A regular expression is a sequence of characters that forms a search pattern. 
 * When you search for data in a text, 
 * you can use this search pattern to describe what you are searching for.
 * A regular expression can be a single character, or a more complicated pattern.
 */
public class Main {
    /*
     * Java does not have a built-in Regular Expression class, 
     * but we can import the java.util.regex 
     * package to work with regular expressions. 
     * The package includes the following classes:
     */

    /*
     * 
     *   Pattern Class - Defines a pattern (to be used in a search)
     *  Matcher Class - Used to search for the pattern
     *   PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
     */

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit Schools!");
        boolean matchFound = matcher.find();

        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }

    
}