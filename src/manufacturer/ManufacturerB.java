package manufacturer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import firstPackagee.*;
import material.Material;


public class ManufacturerB extends Manufacturer {

	
	public ManufacturerB(ArrayList<ArrayList<String>> MANUFACTURER_MATERIALS){
		super(MANUFACTURER_MATERIALS);
	}
	

	public void buyMaterialsByDay(int day, Vendor vendor){
		if(day>0 && vendor != null) {
			String key;
        	int amount;
        	for (int i= 1;  i<super.getManufaturerMaterials().get(day-1).size(); i+=2){
        		key = getManufaturerMaterials().get(day-1).get(i);
        		amount = Integer.parseInt(getManufaturerMaterials().get(day-1).get(i+1));
        		if(!inventory.containsKey(key)) {
        			inventory.put(key, new LIFOList<Material>());
        		}
        		for(int j = 0; j < amount; j++) {
        			inventory.get(key).add(vendor.sell(key));
        		}
        			
        	}
        }else {
        	System.out.println("numberOfDay to produce furniture is negative");
        	System.exit(0);
        }
    }

	@Override
	public IList<IFurniture> getFurnitureList() {
		// TODO Auto-generated method stub
		return null;
	}
}
