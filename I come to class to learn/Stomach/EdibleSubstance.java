public class EdibleSubstance
{
  private String flavor;
  private String type;

  public EdibleSubstance(String f, String t)
  {
    flavor = f;
    type = t;
  }

  public String getFlavor()
  {
    return flavor;
  }

  public String getType()
  {
    return type;
  }

  public boolean equals(EdibleSubstance that)
  {
    return (that.getFlavor().equals(this.getFlavor()) && that.getType().equals(this.getType()));
  }

  public String toString()
  {
    return "Edible substance of flavor " + flavor + " and type " + type + ".";
  }

}
