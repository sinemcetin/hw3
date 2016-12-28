package edu.ceng;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;
/**
 * Created by TOSHIBA1 on 17.12.2016.
 */
public class CountFunction implements ToIntFunction<String> {
    private static final Pattern pattern = Pattern.compile("\\s+");

    @Override
    public int applyAsInt(String value) {
        return pattern.split(value).length;
    }




}
