package manufacturer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import firstPackagee.*;
import material.Material;


public class ManufacturerA extends Manufacturer {
	Map<String, FIFOList<Material>> inventory;
	
	ManufacturerA(ArrayList<ArrayList<String>> MANUFACTURER_MATERIALS){
		super(MANUFACTURER_MATERIALS);
		inventory = new HashMap<String, FIFOList<Material>>();
	}
	
	public void buyMaterialsByDay(int day, Vendor vendor){
		if(day<0 && vendor != null) {
			String key;
        	int amount;
        	for (int i= 1;  i<super.getManufaturerMaterials().get(day-1).size(); i+=2){
        		key = getManufaturerMaterials().get(day-1).get(i);
        		amount = Integer.parseInt(getManufaturerMaterials().get(day-1).get(i+1));
        		if(!inventory.containsKey(key)) {
        			inventory.put(key, new FIFOList<Material>());;
        		}else {
        			for(int j = 0; i < amount; j++) {
        				inventory.get(key).add(vendor.sell(key));
        			}
        			
        		}
        	}
        }else {
        	System.out.println("numberOfDay to produce furniture is negative");
        	System.exit(0);
        }
    }
}
