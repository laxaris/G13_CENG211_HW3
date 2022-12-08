package firstPackagee;

import java.util.ArrayList;
import java.util.Map;

import material.IMaterial;
import material.Material;
import fileIO.FileIO;

public abstract class Manufacturer implements IManufacturer {
    private Map<String, IList<Material>> inventory;
    private final ArrayList<ArrayList<String>> MANUFACTURER_MATERIALS; 
    
    public Manufacturer(Map<String, IList<Material>> inventory, ArrayList<ArrayList<String>> MANUFACTURER_MATERIALS) {
        this.inventory = inventory;
        this.MANUFACTURER_MATERIALS = MANUFACTURER_MATERIALS;
    }


    @Override
    public IList<IMaterial> getInventory() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] getExpectedFurnitures() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public abstract IList<IFurniture> getFurnitureList(); 

    @Override
    public void buyMaterialsByDay(int day, Vendor vendor){
        String key;
        int amount;
        for (int i= 1;  i<MANUFACTURER_MATERIALS.get(day-1).size(); i+=2){
            key = MANUFACTURER_MATERIALS.get(day-1).get(i);
            amount = Integer.parseInt(MANUFACTURER_MATERIALS.get(day-1).get(i+1));
            
        } 
        
    }

    

    @Override
    public void addFurnitureToExpectedFurnitures(String[] furnitures) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void produceFurnitures() {
        // TODO Auto-generated method stub
        
    }
    
}
