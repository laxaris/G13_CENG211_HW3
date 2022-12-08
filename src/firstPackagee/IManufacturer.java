package firstPackagee;

import material.IMaterial;

public interface IManufacturer {
    public IList<IMaterial> getInventory();

    public String[] getExpectedFurnitures();

    public IList<IFurniture> getFurnitureList();

    public void buyMaterialsByDay(int numberOfDay, Vendor vendor);
    
    public void addFurnitureToExpectedFurnitures(String[] furnitures);
    
    public void produceFurnitures();

    
}
