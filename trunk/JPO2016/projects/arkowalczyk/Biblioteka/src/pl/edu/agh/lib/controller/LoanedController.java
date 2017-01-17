package pl.edu.agh.lib.controller;

import pl.edu.agh.lib.model.Component;
import pl.edu.agh.lib.model.database.ComponentDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arek on 2017-01-15.
 */
public class LoanedController {
    private ComponentDatabase componentDatabase;

    public LoanedController(ComponentDatabase componentDatabase) {
        this.componentDatabase = componentDatabase;
    }

    public List<Component> getAvailableComponents()   {
        List<Component> available = new ArrayList<>();
        for (Component component : componentDatabase.getDatabase() )    {
            if (component.isAvailable())    {
                available.add(component);
            }
        }
        return available;
    }
}
