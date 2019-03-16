package za.ac.cput.projectsss;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

  //  @Before
   // public void setUp() throws Exception {
   // }

   // @After
   // public void tearDown() throws Exception {
   // }
     private int lifespan;

     //BIRD TESTS
    @Test
    public void movement() {
        Assert.assertEquals("The bird is flying and its lifespan is" + lifespan, "The bird is flying and its lifespan is" + lifespan);
    }

    @Test
    public void eat() {
        Assert.assertEquals("The bird eats worms", "The bird eats worms");
    }


}