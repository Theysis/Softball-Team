import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Tests ReliefPitcher class.
*/
public class ReliefPitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
 
  /** Tests getSaves method. **/
   @Test public void getSavesTest() {
      ReliefPitcher player1 = new ReliefPitcher("01", 
         "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25, 15);
      Assert.assertEquals(15, player1.getSaves());
   }
   
   /** Tests setSaves method. **/
   @Test public void setSavesTest() {
      ReliefPitcher player1 = new ReliefPitcher("01", 
         "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25, 15);
      player1.setSaves(16);
      Assert.assertEquals(16, player1.getSaves());
   }
   
   /** Tests rating method. **/
   @Test public void ratingTest() {
      ReliefPitcher player1 = new ReliefPitcher("01", 
         "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25, 15);
      Assert.assertEquals(3.40740, player1.rating(), .00001);
   }
   
   /** Tests stats method. **/
   @Test public void statsTest() {
      ReliefPitcher player1 = new ReliefPitcher("01", 
         "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25, 15);
      Assert.assertEquals("12 wins, 4 losses, 15 saves, 1.25 ERA",
         player1.stats());
   }
   
   /** Tests toString method. **/
   @Test public void toStringTest() {
      ReliefPitcher player1 = new ReliefPitcher("01", 
         "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25, 15);
      Assert.assertEquals("01 Jenny Harper (RHP) 12 wins, 4 losses, 15 saves, "
          + "1.25 ERA\nSpecialization Factor: 1.0 "
          + "(class ReliefPitcher) Rating: 3.407",
          player1.toString());
   }
}
