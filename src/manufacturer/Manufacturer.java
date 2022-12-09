package manufacturer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import material.IMaterial;
import material.Material;
import fileIO.FileIO;
import firstPackagee.FIFOList;
import firstPackagee.IFurniture;
import firstPackagee.IList;
import firstPackagee.Vendor;

public abstract class Manufacturer implements IManufacturer {
    Map<String, IList<Material>> inventory;
    IList<String> processLine;
    private final ArrayList<ArrayList<String>> MANUFACTURER_MATERIALS; 

    
    public Manufacturer( ArrayList<ArrayList<String>> MANUFACTURER_MATERIALS) {
        this.MANUFACTURER_MATERIALS = MANUFACTURER_MATERIALS;
        inventory = new HashMap<String, IList<Material>>();
    }

    public ArrayList<ArrayList<String>> getManufaturerMaterials(){
    	return  MANUFACTURER_MATERIALS;
    }
    
    @Override
    public Map<String, IList<Material>> getInventory(){
        return inventory;
    }

    @Override
    public String[] getExpectedFurnitures() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public abstract IList<IFurniture> getFurnitureList(); 

    @Override
    public abstract void buyMaterialsByDay(int day, Vendor vendor);
   
    @Override
    public void addFurnitureToExpectedFurnitures(String[] furnitures) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void produceFurnitures() {
        // TODO Auto-generated method stub
        
    }
    
}
