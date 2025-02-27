package firstPackagee;

import java.util.Dictionary;


public interface IFurniture {

    /**
     * returns the furniture code.
     * @return String
     */
    public String getFurnitureCode();

    /**
     * returns the furniture's cost.
     * @return int
     */
    public String getFurnitureName();

    /**
     * returns the furniture's cost.
     * @return int
     */
    public int getFurnitureCost();

    /**
     * returns the furniture's quality out of 100.
     * @return int
     */
    public int getFurnitureQuality();


    public int getInCome();

    /**
     * returns the furniture's properties.
     * @return string
     */
    public String toString();

    /**
     * returns a copy of the furniture.
     * @return IFurniture
     */
    public IFurniture clone();

    /**
     * returns the furniture's name.
     * @return String
     */
    public String getFurnitureMaterial();
    
    /**
     * returns the furniture's name.
     * @return String
     */
    public String getFurniturePrice();

    /**
     * returns the furniture's needed parts dictionary.
     * @return String
     */
    public Dictionary<String,Integer> getFurnitureParts();
    
}
