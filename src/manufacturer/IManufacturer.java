package manufacturer;

import java.util.Map;

import firstPackagee.IFurniture;
import firstPackagee.IList;
import firstPackagee.Vendor;
import material.Material;

public interface IManufacturer {
    public Map<String, IList<Material>> getInventory();

    public String[] getExpectedFurnitures();

    public IList<IFurniture> getFurnitureList();

    public void buyMaterialsByDay(int numberOfDay, Vendor vendor);
    
    public void addFurnitureToExpectedFurnitures(String[] furnitures);
    
    public void produceFurnitures();

    
}
