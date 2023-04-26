package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {
    public Player(String uuid) {
        this.uuid = uuid;
        this.homes = new ArrayList<Home>();
    }

    private final String uuid;
    private ArrayList<Home> homes;

    public String getUuid() {
        return uuid;
    }

    public void addHome(Home home) {
        this.homes.add(home);
    }

    /**
     * Trying to find player home by name.
     * @param homeName name for the searched home.
     * @return home
     */
    public Home getHomeByName(String homeName) {
        for (Home home: homes) {
            if(Objects.equals(home.getName(), homeName)) {
                return home;
            }
        }
        return null;
    }
}
