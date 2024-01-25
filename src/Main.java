import DataBase.CourierStorage;
import DataBase.DummyData;
import Implementation.CourierImplementation;

public class Main {

    public static void main(String[] args) {
        CourierImplementation c = new CourierImplementation();

        c.addPackage(DummyData.dummyData());
        c.addPackage(DummyData.dummyData2());
        c.addPackage(DummyData.dummyData3());
        c.addPackage(DummyData.dummyData4());

        System.out.println(CourierStorage.ourData());

    }

}