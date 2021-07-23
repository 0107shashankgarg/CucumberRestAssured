package pojos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    public String isbn;
    public String title;
    public String subTitle;
    public String author;
    public String published;
    public String publisher;
    public int pages;
    public String description;
    public String website;
}

/*{
        "userID": "9b5f49ab-eea9-45f4-9d66-bcf56a531b85",
        "userName": "TOOLSQA-Test",
        "books": [
        {
        "isbn": "9781449325862",
        "title": "Git Pocket Guide",
        "subTitle": "A Working Introduction",
        "author": "Richard E. Silverman",
        "published": "2013-08-02T00:00:00",
        "publisher": "O'Reilly Media",
        "pages": 234,
        "description": "This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git experience.",
        "website": "https://chimera.labs.oreilly.com/books/1230000000561/index.html"
        }
        ]
        }*/

