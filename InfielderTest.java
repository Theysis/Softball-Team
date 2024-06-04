import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests the Infielder class for errors.
*/
public class InfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

      /** Tests getInfielderInfieldingAvg method. **/
   @Test public void getInfieldingAvgTest() {
      Infielder player1 
               = new Infielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals(.950, player1.getInfielderFieldingAvg(), .0001);
   }
   
   /** Tests setInfielderInfieldingAvg method. **/
   @Test public void setInfieldingAvgTest() {
      Infielder player1 
            = new Infielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      player1.setInfielderFieldingAvg(.920);
      Assert.assertEquals(.920, player1.getInfielderFieldingAvg(), .0001);
   }
   
   /** Tests rating method. **/
   @Test public void ratingTest() {
      Infielder player1 
               = new Infielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals(3.5625, player1.rating(), .0001);
   }
   
}
