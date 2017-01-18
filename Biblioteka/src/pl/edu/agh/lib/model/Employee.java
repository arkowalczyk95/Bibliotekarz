package pl.edu.agh.lib.model;

/**
 * Created by Arek on 2017-01-11.
 */
public class Employee {
    private String login;
    private String password;

    public Employee(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return login + " " + password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!login.equals(employee.login)) return false;
        return password.equals(employee.password);

    }

    @Override
    public int hashCode() {
        int result = login.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
