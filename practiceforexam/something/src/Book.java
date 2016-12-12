/**
 * Created by mozgaanna on 30/11/16.
 */
public class Book {

    private String title;
    private int pubYear;

    public static int count;

    public Book(String title) {
            this(title, -1);

            // Do not include ++count; here because it already
            // executes in the second constructor and would
            // execute here after this() returns. You would end
            // up with one extra book in the count.
        }

    public Book(String title, int pubYear) {
        setTitle(title);
        setPubYear(pubYear);
        ++count;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }


    public String getTitle() {
        return title;
    }

    public int getPubYear() {
        return pubYear;
    }

    @Override
    public String toString() {
        return "Title: "+this.title;
    }
}
