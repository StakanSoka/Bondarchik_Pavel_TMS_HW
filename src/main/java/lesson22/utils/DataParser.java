package lesson22.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataParser {

    public static final String BASED_FORMAT = "dd.MM.yyyy";

    public static Date parse(String date, String format) throws ParseException {
        DateFormat formatter = new SimpleDateFormat(format);
        return formatter.parse(date);
    }
}
