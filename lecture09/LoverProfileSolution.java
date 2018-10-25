package comp110.lecture09;

// Class Declaration
public class LoverProfileSolution {

  // Field Declarations
  private String _name;
  private int _age;
  private boolean _lovesUNC;

  // Constructor
  public LoverProfileSolution() {

    Console console = new Console();
    _name = console.promptString("Name");
    _age = console.promptInt("Age");
    _lovesUNC = console.confirm("Love UNC?");
    console.close();

  }

  // Methods
  public String getName() {
    return _name;
  }

  public boolean isLover() {
    int myAge = 0; // Change to be *your* age
    boolean oldEnough = _age > myAge / 2 + 7;
    return oldEnough && _lovesUNC;
  }

}