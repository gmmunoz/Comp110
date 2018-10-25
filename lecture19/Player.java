package comp110.lecture19;

public class Player {

    // Fields
    private String _name;

    private int _minutes, _points;

    // Constructor
    public Player(String name, int minutes, int points) {
        _name = name;
        _minutes = minutes;
        _points = points;
    }

    // Methods
    public String getName() {
        return _name;
    }

    public int getMinutes() {
        return _minutes;
    }

    public int getPoints() {
        return _points;
    }

    public double efficiency() {
        return (double) _points / (double) _minutes;
    }

    public String toString() {
        return _name + " " + _minutes + "min " + _points + "pts " + this.efficiency() + "pts/min";
    }

}
