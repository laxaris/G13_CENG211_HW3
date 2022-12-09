package furnitureFactorySimulation;
import firstPackagee.*;
import furnitures.FurnitureParts;
import manufacturer.ManufacturerA;
import material.MaterialProperties;
import material.Material;
import fileIO.FileIO;
import java.util.ArrayList;

public class FurnitureFactorySimulation implements IFurnitureFactorySimulation{

    @Override
    public void runSimulation() {
        /* Vendor vendor = vendorFiller();
        ManufacturerA manufacturerA = new ManufacturerA(FileIO.MANUFACTURER_1_MATERIALS);
        System.out.println(vendor==null);
        System.out.print(vendor.getListOfMaterials().keySet());
        manufacturerA.buyMaterialsByDay(1, vendor);
        System.out.println(manufacturerA.getInventory().keySet());
        System.out.println(manufacturerA.getInventory().get("PL012").size());
        System.out.println(manufacturerA.getInventory().get("HD502").toString()); */
        System.out.println(FurnitureParts.furnitureParts);
        
        
    }

    private Vendor vendorFiller(){
        ArrayList<MaterialProperties>  propertiesList = new ArrayList<MaterialProperties>();
        ArrayList<Material> materialList = new ArrayList<Material>();

        for(ArrayList<String> list : FileIO.RAW_MATERIAL_PROPERTIES){
            propertiesList.add(new MaterialProperties(list.get(0),Integer.parseInt(list.get(1)),Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3)), Integer.parseInt(list.get(4))));
        }
        for(ArrayList<String> list : FileIO.VENDOR_POSSESSIONS){
            materialList.add(materialCreator(list, propertiesList));
       } 
       return new Vendor(materialList);
    }

    private Material materialCreator(ArrayList<String> listOfVendorPossesions, ArrayList<MaterialProperties> listOfMaterialProperties){
        System.out.println(listOfVendorPossesions.toString());
        
        for(MaterialProperties element : listOfMaterialProperties){
            System.out.println(element.getCode());
            if(element.getCode().equals(listOfVendorPossesions.get(0))){
                return new Material(listOfVendorPossesions.get(0),Integer.parseInt(listOfVendorPossesions.get(1)), element);
            }
        }
        System.out.println("unmatched code of material properties and code of material");
        System.exit(0);
        return null;
    }
    
    
    
}