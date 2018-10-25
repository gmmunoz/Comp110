package comp110.lecture26;

public class MenuItem {

  private String _name;

  private double _calories, _protein, _carbs, _fat;

  private boolean _organic, _vegetarian, _glutenFree, _vegan;

  public MenuItem(String name) {
    _name = name;
  }

  public String getName() {
    return _name;
  }

  public void setCalories(double calories) {
    _calories = calories;
  }

  public double getCalories() {
    return _calories;
  }

  public void setProtein(double protein) {
    _protein = protein;
  }

  public double getProtein() {
    return _protein;
  }

  public void setCarbs(double carbs) {
    _carbs = carbs;
  }

  public double getCarbs() {
    return _carbs;
  }

  public void setFat(double fat) {
    _fat = fat;
  }

  public double getFat() {
    return _fat;
  }

  public void setOrganic(boolean organic) {
    _organic = organic;
  }

  public boolean getOrganic() {
    return _organic;
  }

  public void setVegetarian(boolean vegetarian) {
    _vegetarian = vegetarian;
  }

  public boolean getVegetarian() {
    return _vegetarian;
  }

  public void setGlutenFree(boolean glutenFree) {
    _glutenFree = glutenFree;
  }

  public boolean getGlutenFree() {
    return _glutenFree;
  }

  public void setVegan(boolean vegan) {
    _vegan = vegan;
  }

  public boolean getVegan() {
    return _vegan;
  }

}