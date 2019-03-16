package za.ac.cput.projectsss;

import org.junit.Assert;
import org.junit.Test;

public class ElephantTest {

    private String name;

    //MOVEMENT TEST
    @Test
    public void movement(){
        name= "An elephant";
        Assert.assertEquals(name + "is in motion", name + "is in motion");
    }


    //EAT TEST
    @Test
    public void eat(){
        Assert.assertEquals("An elephant will eat what needs to be eaten", "An elephant will eat what needs to be eaten");
    }

}
