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
}
