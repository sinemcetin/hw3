package edu.ceng;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.IOException;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created by TOSHIBA1 on 17.12.2016.
 */
public class Main {
    @Option(name = "-file", required = true)
    private String file;

    @Option(name = "-field", required = true)
    private String field;

    @Option(name = "-month", required = true)
    private String month;

    @Option(name = "-type", required = true)
    private String type;

    private int run(String[] args) throws IOException {
        // Your code goes here ...
        final ArrayList<String> monthArray = new ArrayList<>(Arrays.asList(
                "january", "february", "march", "april", "may", "june", "july",
                "august", "september", "october", "november", "december"
        ));
        try {
            new CmdLineParser(this).parseArgument(args);
            final FIELD f = FIELD.valueOf(field.toLowerCase(Locale.ENGLISH));
            final TYPE t = TYPE.valueOf(
                    type.substring(0, 1).toUpperCase(Locale.ENGLISH) +
                            type.substring(1).toLowerCase(Locale.ENGLISH));
            final Month m = Month.of(monthArray.indexOf(month.toLowerCase(Locale.ENGLISH)) + 1);
            //Helper.printDistinctMonths(file);
            Helper.printStats(file, f, m, t);
            return 0;
        } catch (Exception ex){
            return 1;
        }
    }

    public static void main(String[] args) throws IOException {
        System.exit(new Main().run(args));
    }
}
