package DataBase;

import Entity.Packages;

import java.util.Arrays;

public class CourierStorage {
    public static Packages[] packageDatabase = new Packages[2];
    public static int pointer;


    public static int add(Packages packages){
        if(pointer==packageDatabase.length-1)
           extendArray();

        packageDatabase[pointer] = packages;
        pointer++;
        return packages.getPackageID();
    }

    private static void extendArray(){
        Packages[] newArray = new Packages[packageDatabase.length+2];
        for (int i=0;i<packageDatabase.length;i++){
            newArray[i] = packageDatabase[i];
        }
        packageDatabase= newArray;
    }


    public static void remove(int pacId){
        int foundElememtID = searchByPackageID(pacId);
      if(foundElememtID==-1)
          return;
      for (int i=foundElememtID;i<=pointer;i++){
          packageDatabase[i]=packageDatabase[i+1];
      }
      packageDatabase[pointer]= null;
      --pointer;
    }

    public static int searchByPackageID(int packageID){
        for (int i =0 ; i<=pointer;i++){
            if(packageDatabase[i].getPackageID()==packageID)
                return i;
        }
        return -1;
    }


    public static String ourData() {
        return Arrays.toString(packageDatabase) ;
    }
}
