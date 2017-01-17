package pl.edu.agh.lib.model;

/**
 * Created by Arek on 2017-01-11.
 */
public class Component {

    private int id;
    private String title;
    private String author;
    private boolean isAvailable;


    public Component(int id, String author, String title) {
        this.id = id;
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return id + " '" + author + "'" + " " + title;
    }
}





