import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Serves as Junit test for Pitcher class.
*/
public class PitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Tests getWins method. **/
   @Test public void getWinsTest() {
      Pitcher player1 
             = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      Assert.assertEquals(12, player1.getWins());
   }
   
   /** Tests setWins method. **/ 
   @Test public void setWinsTest() {
      Pitcher player1 
          = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      player1.setWins(9);
      Assert.assertEquals(9, player1.getWins());
   }
   
   /** Tests getLosses Method. **/
   @Test public void getLossesTest() {
      Pitcher player1 
          = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      Assert.assertEquals(4, player1.getLosses());
   }
   
   /** Tests setLosses Method. **/
   @Test public void setLossesTest() {
      Pitcher player1 
          = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      player1.setLosses(3);
      Assert.assertEquals(3, player1.getLosses());
   }
   
   /** Tests getEra method. **/
   @Test public void getEraTest() {
      Pitcher player1 
          = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      Assert.assertEquals(1.25, player1.getEra(), .00001);
   }
   
   /** Tests setEra method. **/
   @Test public void setEraTest() {
      Pitcher player1 
          = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      player1.setEra(3.12);
      Assert.assertEquals(3.12, player1.getEra(), .00001);
   }
   
   /** Tests Rating method. **/ 
   @Test public void ratingTest() {
      Pitcher player1 
          = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      Assert.assertEquals(1.42222, player1.rating(), .00001);
   }
   
   /** Tests Stats method. **/
   @Test public void statsTest() {
      Pitcher player1 
          = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      Assert.assertEquals("12 wins, 4 losses, 1.25 ERA", player1.stats());
   }
   
   /** Tests toString method. **/
   @Test public void toStringTest() {
      Pitcher player1 
          = new Pitcher("01", "Jenny Harper", "RHP", 1.0, .375, 12, 4, 1.25);
      Assert.assertEquals("01 Jenny Harper (RHP) 12 wins, 4 losses, 1.25 ERA"
         + "\nSpecialization Factor: 1.0 (class Pitcher) Rating: 1.422",
            player1.toString());
   }
}
