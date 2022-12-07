public interface IMaterial {

    /**
     * returns the material code.
     * @return String
     */
    public String getMaterialCode();

    /**
     * returns the material's cost.
     * @return int
     */
    public int getMaterialCost();

    /**
     * returns the material quality out of 100.
     * @return int
     */
    public int getMaterialQuality();

    /**
     * returns the material's length.
     * @return int
     */
    public int getLength();

    /**
     * returns the material's width.
     * @return int
     */
    public int getWidth();

    /**
     * returns the material's height.
     * @return int
     */
    public int getHeight();

    /**
     * returns the material's properties.
     * @return string
     */
    public String toString();

    /**
     * returns a copy of the material.
     * @return IMaterial
     */
    public IMaterial clone();

    /**
     * returns the material's name.
     * @return String
     */
    public String getMaterialName();
}
