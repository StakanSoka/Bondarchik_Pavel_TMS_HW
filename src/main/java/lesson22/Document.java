package lesson22;

import java.util.Date;

public class Document {

    private String name;
    private Date creationDate;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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
