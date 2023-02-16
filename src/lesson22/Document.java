package lesson22;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Document {

    private String name;
    private Date creationDate;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationDate(String creationDate, String format) throws ParseException {
        DateFormat formatter = new SimpleDateFormat(format);
        this.creationDate = formatter.parse(creationDate);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", creationDate=" + creationDate.getTime() +
                ", author='" + author + '\'' +
                '}';
    }
}
