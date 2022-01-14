import org.junit.Assert;
import org.junit.Test;

public class BuildingUT {
    @Test
    public void numberofResidents_should_be1_adding_resident(){
        Building building = new Building(0,"Manfred");
        Assert.assertEquals(building.numberOfResidents(), 1);
    }
}
