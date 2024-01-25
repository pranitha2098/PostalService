package Implementation;

import DataBase.CourierStorage;
import Entity.Packages;


public class CourierImplementation {

public int addPackage(Packages packages){
    if(checkExistingPackages(packages.getPackageID())){
        System.out.println("pack id already exists ");
    return -1;
    }
    return CourierStorage.add(packages);
}

private Boolean checkExistingPackages(int pakId){
    for(int i=0;i<CourierStorage.pointer;i++){
        if(CourierStorage.packageDatabase[i].getPackageID() == pakId)
            return true;
    }
    return false;
}

public void removePackage(int packid){
    CourierStorage.remove(packid);
}


}
