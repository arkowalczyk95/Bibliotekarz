package pl.edu.agh.lib.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arek on 2017-01-11.
 */
public class User {
    private int id;
    private String name;
    private String surname;
    private List<Component> loanedBooks;

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        loanedBooks = new ArrayList<>();

    }

    public void addLoanedComponent(Component component)    {
        loanedBooks.add(component);
    }
    public void removeLoanedComponent(Component component)  {
        loanedBooks.remove(component);
    }

    public List<Component> getLoanedBooks() {
        return loanedBooks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id == user.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
