package manufacturer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import material.Material;
import firstPackagee.IList;
import firstPackagee.Vendor;
import furnitures.IFurniture;

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
    public Map<String, IList<Material>> cloneMap(Map<String, IList<Material>> map){
    	Map<String, IList<Material>> clone = new HashMap<String, IList<Material>>();
    	for(Map.Entry<String, IList<Material>> entry : map.entrySet()) {
    		clone.put(entry.getKey(), entry.getValue().clone());
    	}
    	return clone;
    }
    
}
