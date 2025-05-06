package modelObject.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookModel {
    private String title;
    private String isbn;
    private String subTitle;
    private String author;
    private String publishDate;
    private String publisher;
    private int pages;
    private String description;
    private String website;
}
