package models;

public class Home {
    public Home(String name, Coordinate coordinate) {
        this.name = name;
        this.coordinate = coordinate;
    }
    private String name;
    private Coordinate coordinate;

    public String getName() {
        return name;
    }
}
