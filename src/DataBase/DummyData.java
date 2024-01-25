package DataBase;

import Entity.Address;
import Entity.Packages;
import Entity.PostalDetails;
import Enums.PostSIze;
import Enums.PostType;

public class DummyData {

   public static Packages dummyData(){
        Address sendersAddress = new Address("champa gali","andher nagri","ka","560100");
        Address reciversAddress = new Address("puspa gali","ujal nagri","tn","000100");
        PostalDetails postalDetails = new PostalDetails(PostSIze.Large, PostType.SpeedPost);
        Packages p = new Packages(1,"sameer",sendersAddress,reciversAddress,postalDetails);
        return p;
    }
   public static Packages dummyData2(){
        Address sendersAddress = new Address("champa gali","andher nagri","ka","560100");
        Address reciversAddress = new Address("puspa gali","ujal nagri","tn","000100");
        PostalDetails postalDetails = new PostalDetails(PostSIze.Large, PostType.regular);
        Packages p = new Packages(2,"suresh",sendersAddress,reciversAddress,postalDetails);
        return p;
    }
   public static Packages dummyData3(){
        Address sendersAddress = new Address(" gali","andher ","ka","560100");
        Address reciversAddress = new Address(" gali","ujal ","tn","000100");
        PostalDetails postalDetails = new PostalDetails(PostSIze.Large, PostType.SpeedPost);
        Packages p = new Packages(3,"pranitha",sendersAddress,reciversAddress,postalDetails);
        return p;
    }
    public static Packages dummyData4(){
        Address sendersAddress = new Address(" gali","andher ","ka","560100");
        Address reciversAddress = new Address(" gali","ujal ","tn","000100");
        PostalDetails postalDetails = new PostalDetails(PostSIze.Large, PostType.SpeedPost);
        Packages p = new Packages(3,"pranitha",sendersAddress,reciversAddress,postalDetails);
        return p;
    }

}
