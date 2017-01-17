package pl.edu.agh.lib.model.database;

import pl.edu.agh.lib.model.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arek on 2017-01-10.
 */
public class ComponentDatabase {

    private int maxBooksAmount = 100;
    private List<Component> database;

    public ComponentDatabase() {
        database = new ArrayList<>();
    }

    public void addComponent(Component component)  {
        database.add(component);
    }

    public List<Component> getDatabase() {
        return database;
    }
}
