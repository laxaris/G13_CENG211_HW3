package firstPackagee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import material.Material;

public class Vendor implements IVendor {
    private Map<String, ArrayList<Material>> materials; 



   

    public Vendor(Vendor vendor) {
        Map<String,ArrayList<Material>> temp = new HashMap<String,ArrayList<Material>>();
        for(Map.Entry<String,ArrayList<Material>> entry : vendor.materials.entrySet()){
            temp.put(entry.getKey(), entry.getValue());
        }
        this.materials = temp;
    }

    @Override
    public Map<String,ArrayList<Material>> getListOfMaterials() {
        return this.clone().materials;
    }

    @Override
    public String toString() {
        return "Vendor [materials=" + materials.toString() + "]";
    }
    @Override
    public Vendor clone() {
        return new Vendor(this);
    }

    public Vendor(ArrayList<Material> materials) {
        String key = materials.get(0).getMaterialCode();
        ArrayList<Material> listOfMaterial = new ArrayList<>();
        for(Material element : materials){
            if(key ==  element.getMaterialCode()){
                listOfMaterial.add(element);
            }
            else{
                this.materials.put(key, listOfMaterial);
                key = element.getMaterialCode();
                listOfMaterial = new ArrayList<>();
                listOfMaterial.add(element);
            }
        }
    }
}
