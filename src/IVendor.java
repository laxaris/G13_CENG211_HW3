import java.util.ArrayList;

public interface IVendor {
    /**
     * returns the vendor's material list.
     * @return ArrayList<IMaterial>
     */
    public ArrayList<IMaterial>getListOfMaterials();
    
    /**
     * returns the vendor's copy.
     * @return IVendor
     */
    public IVendor clone();

    /**
     * returns the vendor's list as string
     * @return String
     */
    public String toString();
}
