import org.junit.Assert;
import org.junit.Test;

public class BuildingUT {
    @Test
    public void numberofResidents_should_be1_adding_resident(){
        Building building = new Building(0,"Manfred");
        Assert.assertEquals(building.numberOfResidents(), 1);
    }
    @Test
    public void numberofResidents_should_be2_adding_two_resident(){
        Building building = new Building(0,"Manfred");
        Building building2 = new Building(0,"Franz");
        Assert.assertEquals(building.numberOfResidents(), 1);
    }
    @Test
    public void after_adding_resident_must_remove(){
        Building building = new Building(0,"Manfred");
        building.removeResident("Manfred");
        Assert.assertEquals(building.numberOfResidents(), 0);
    }
    @Test
    public void add_stringarray_of_residents(){
        String[] residents = {"Manfred", "Franz", "Fritz"};
        Building building = new Building(0,residents);
        Assert.assertEquals(building.numberOfResidents(), 3);
    }
    @Test
    public void add_resident_should_work(){
        String[] residents = {"Manfred", "Franz", "Fritz"};
        Building building = new Building(0,residents);
        building.addResident("Jakob");
        Assert.assertEquals(building.numberOfResidents(), 4);
    }
    @Test
    public void add_duplicate_resident_should_not_work(){
        String[] residents = {"Manfred", "Franz", "Fritz"};
        Building building = new Building(0,residents);
        building.addResident("Fritz");
        Assert.assertEquals(building.numberOfResidents(), 3);
    }
}
