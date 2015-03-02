public class Country
{
  String countryName;
  boolean isPeaceful;
  int militarySize;
  int population;
  
  public Country(String name, int pop, int mil, boolean peaceful)
  {
    countryName = name;
    population = pop;
    militarySize = mil;
    isPeaceful = peaceful;
  }
  public boolean isPeaceful()
  {
    return isPeaceful;
  }
  public int getMilitarySize()
  {
    return militarySize;
  }
  public void getPopulation()
  {
    return population;
  }
  public String getCountryName()
  {
    return countryName;
  }
  
  //set
  
  public void setPeaceful(boolean peaceful)
  {
    isPeaceful = peaceful;
  }
  public void setName(String name)
  {
    countryName = name;
  }
  public void setMilitarySize(int size)
  {
    militarySize = size;
  }
  public void setPopulation(int population)
  {
    this.population = population;
  }
  
}
