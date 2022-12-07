import java.util.Dictionary;

public interface IManufacturer {
    public IList<IMaterial> getInventory();

    public String[] getExpectedFurnitures();

    public IList<IFurniture> getFurnitureList();

    public void buyMaterialsByDay(String[] materials);
    
    public void addFurnitureToExpectedFurnitures(String[] furnitures);
    public void produceFurnitures();

    
}
